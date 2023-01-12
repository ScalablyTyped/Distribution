package typings.atlaskitMotion

import typings.atlaskitMotion.anon.Delay
import typings.atlaskitMotion.atlaskitMotionStrings.responsive
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringStaggeredEntranceMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/staggered-entrance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * For a list of elements that need to animate in,
    * this should be used in conjunction with entering components.
    * This does not need Javascript to execute so it will run immediately for any SSR rendered React apps before the JS has executed.
    *
    * Will dynamically add delay to each child entering component.
    * Unfortunately all entering components _NEED_ to be a direct descendant.
    */
  @JSImport("@atlaskit/motion/dist/types/entering/staggered-entrance", JSImport.Default)
  @js.native
  val default: FC[StaggeredEntranceProps] = js.native
  
  inline def useStaggeredEntrance(): Delay = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaggeredEntrance")().asInstanceOf[Delay]
  
  trait StaggeredEntranceProps extends StObject {
    
    /**
      * Any valid react child with an entrance motion somewhere in the tree as a descendant.
      */
    var children: Element | js.Array[Element]
    
    /**
      * Index of the column.
      * Useful if you want to have columns inside separate containers.
      * Starts from `0`.
      */
    var column: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of columns the children elements will be displayed over.
      * Use `"responsive"` to have it calculate dynamically on the client side.
      *
      * __NOTE:__ This has a big caveat that the elements will be invisible until the client side Javascript executes.
      * If you have a fixed grid or list, set this to a specific number.
      * Defaults to `"responsive"`.
      */
    var columns: js.UndefOr[Double | responsive] = js.undefined
    
    /**
      * Delay in ms.
      * How long each element group will be staggered.
      * This will be multipled by the column and row of the element.
      * Defaults to `50`.
      */
    var delayStep: js.UndefOr[Double] = js.undefined
  }
  object StaggeredEntranceProps {
    
    inline def apply(children: Element | js.Array[Element]): StaggeredEntranceProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaggeredEntranceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaggeredEntranceProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumns(value: Double | responsive): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDelayStep(value: Double): Self = StObject.set(x, "delayStep", value.asInstanceOf[js.Any])
      
      inline def setDelayStepUndefined: Self = StObject.set(x, "delayStep", js.undefined)
    }
  }
}
