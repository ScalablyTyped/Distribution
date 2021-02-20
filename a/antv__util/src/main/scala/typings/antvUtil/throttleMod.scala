package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod {
  
  @JSImport("@antv/util/lib/throttle", JSImport.Default)
  @js.native
  def default(func: js.Function, wait: Double, options: OptionsType): js.Function = js.native
  
  @js.native
  trait OptionsType extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object OptionsType {
    
    @scala.inline
    def apply(): OptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsType]
    }
    
    @scala.inline
    implicit class OptionsTypeMutableBuilder[Self <: OptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
