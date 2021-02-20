package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowContextMod extends Shortcut {
  
  @JSImport("antd/lib/grid/RowContext", JSImport.Default)
  @js.native
  val default: Context[RowContextState] = js.native
  
  @js.native
  trait RowContextState extends StObject {
    
    var gutter: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object RowContextState {
    
    @scala.inline
    def apply(): RowContextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowContextState]
    }
    
    @scala.inline
    implicit class RowContextStateMutableBuilder[Self <: RowContextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGutter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = Context[RowContextState]
  
  /* This means you don't have to write `default`, but can instead just say `rowContextMod.foo` */
  override def _to: Context[RowContextState] = default
}
