package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.PropertyAccessor")
@js.native
/* private */ open class PropertyAccessor ()
  extends StObject
     with typings.activexOutlook.Outlook.PropertyAccessor {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def BinaryToString(Value: Any): String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def DeleteProperties(SchemaNames: Any): Any = js.native
  
  /* CompleteClass */
  override def DeleteProperty(SchemaName: String): Unit = js.native
  
  /* CompleteClass */
  override def GetProperties(SchemaNames: Any): Any = js.native
  
  /* CompleteClass */
  override def GetProperty(SchemaName: String): Any = js.native
  
  /* CompleteClass */
  override def LocalTimeToUTC(Value: VarDate): VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def SetProperties(SchemaNames: Any, Values: Any): Any = js.native
  
  /* CompleteClass */
  override def SetProperty(SchemaName: String, Value: Any): Unit = js.native
  
  /* CompleteClass */
  override def StringToBinary(Value: String): Any = js.native
  
  /* CompleteClass */
  override def UTCToLocalTime(Value: VarDate): VarDate = js.native
}
