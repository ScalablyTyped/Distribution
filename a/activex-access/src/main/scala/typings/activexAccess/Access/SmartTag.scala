package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTag extends StObject {
  
  /* private */ @JSName("Access.SmartTag_typekey")
  var AccessDotSmartTag_typekey: SmartTag
  
  val Application: typings.activexAccess.Access.Application
  
  def Delete(): Unit
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val IsMissing: Boolean
  
  val Name: String
  
  val Parent: js.Any
  
  def Properties(Index: String): SmartTagProperty
  def Properties(Index: Double): SmartTagProperty
  @JSName("Properties")
  val Properties_Original: SmartTagProperties
  
  def SmartTagActions(Index: String): SmartTagAction
  def SmartTagActions(Index: Double): SmartTagAction
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions
  
  val XML: String
}
object SmartTag {
  
  inline def apply(
    AccessDotSmartTag_typekey: SmartTag,
    Application: Application,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    IsMissing: Boolean,
    Name: String,
    Parent: js.Any,
    Properties: SmartTagProperties,
    SmartTagActions: SmartTagActions,
    XML: String
  ): SmartTag = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsMissing = IsMissing.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTag_typekey")(AccessDotSmartTag_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTag]
  }
  
  extension [Self <: SmartTag](x: Self) {
    
    inline def setAccessDotSmartTag_typekey(value: SmartTag): Self = StObject.set(x, "Access.SmartTag_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setIsMissing(value: Boolean): Self = StObject.set(x, "IsMissing", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SmartTagProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
