package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormlyConfig extends StObject {
  
  var disableWarnings: Boolean = js.native
  
  var extras: IFormlyConfigExtras = js.native
  
  def setType(typeOptions: ITypeOptions): Unit = js.native
  
  def setWrapper(wrapperOptions: js.Array[IWrapperOptions]): Unit = js.native
  def setWrapper(wrapperOptions: IWrapperOptions): Unit = js.native
  
  var templateManipulators: ITemplateManipulators = js.native
}
