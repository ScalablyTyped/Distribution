package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.UserProperty")
@js.native
class UserProperty protected ()
  extends StObject
     with typings.activexOutlook.Outlook.UserProperty {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override val IsUserProperty: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  @JSName("Outlook.UserProperty_typekey")
  var OutlookDotUserProperty_typekey: typings.activexOutlook.Outlook.UserProperty = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Type: OlUserPropertyType = js.native
  
  /* CompleteClass */
  var ValidationFormula: String = js.native
  
  /* CompleteClass */
  var ValidationText: String = js.native
  
  /* CompleteClass */
  var Value: js.Any = js.native
}
