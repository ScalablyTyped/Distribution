package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressLists extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): AddressList
  
  /* private */ @JSName("Outlook.AddressLists_typekey")
  var OutlookDotAddressLists_typekey: AddressLists
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object AddressLists {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => AddressList,
    OutlookDotAddressLists_typekey: AddressLists,
    Parent: js.Any,
    Session: NameSpace
  ): AddressLists = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressLists_typekey")(OutlookDotAddressLists_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressLists]
  }
  
  extension [Self <: AddressLists](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => AddressList): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotAddressLists_typekey(value: AddressLists): Self = StObject.set(x, "Outlook.AddressLists_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
