package typings.atlaskitPopper

import typings.atlaskitPopper.anon.ReadonlyManagerProps
import typings.atlaskitPopper.anon.ReadonlyReferenceProps
import typings.atlaskitPopper.distTypesPopperMod.CustomPopperProps
import typings.popperjsCore.libEnumsMod.Placement
import typings.react.mod.global.JSX.Element
import typings.reactPopper.mod.ManagerProps
import typings.reactPopper.mod.ReferenceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/popper", "Manager")
  @js.native
  open class Manager protected ()
    extends typings.reactPopper.mod.Manager {
    def this(props: ReadonlyManagerProps) = this()
    def this(props: ManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ManagerProps, context: Any) = this()
  }
  
  inline def Popper[CustomModifiers](param0: CustomPopperProps[CustomModifiers]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popper")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@atlaskit/popper", "Reference")
  @js.native
  open class Reference protected ()
    extends typings.reactPopper.mod.Reference {
    def this(props: ReadonlyReferenceProps) = this()
    def this(props: ReferenceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReferenceProps, context: Any) = this()
  }
  
  @JSImport("@atlaskit/popper", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
}
