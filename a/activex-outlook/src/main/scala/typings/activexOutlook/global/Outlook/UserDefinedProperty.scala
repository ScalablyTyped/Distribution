package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.UserDefinedProperty")
@js.native
/* private */ class UserDefinedProperty ()
  extends StObject
     with typings.activexOutlook.Outlook.UserDefinedProperty {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DisplayFormat: Double = js.native
  
  /* CompleteClass */
  override val Formula: String = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.UserDefinedProperty_typekey")
  var OutlookDotUserDefinedProperty_typekey: typings.activexOutlook.Outlook.UserDefinedProperty = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Type: OlUserPropertyType = js.native
}
