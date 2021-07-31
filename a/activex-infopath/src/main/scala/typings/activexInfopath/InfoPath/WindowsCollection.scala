package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsCollection extends StObject {
  
  val Count: Double
  
  @JSName("InfoPath.WindowsCollection_typekey")
  var InfoPathDotWindowsCollection_typekey: WindowsCollection
  
  def Item(varIndex: js.Any): Window
}
object WindowsCollection {
  
  @scala.inline
  def apply(Count: Double, InfoPathDotWindowsCollection_typekey: WindowsCollection, Item: js.Any => Window): WindowsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.WindowsCollection_typekey")(InfoPathDotWindowsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsCollection]
  }
  
  @scala.inline
  implicit class WindowsCollectionMutableBuilder[Self <: WindowsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotWindowsCollection_typekey(value: WindowsCollection): Self = StObject.set(x, "InfoPath.WindowsCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Window): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
