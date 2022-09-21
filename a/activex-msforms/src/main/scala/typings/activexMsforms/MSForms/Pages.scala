package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends StObject {
  
  def apply(varg: Any): Any = js.native
  
  def Add(): Page = js.native
  def Add(bstrName: Any): Page = js.native
  def Add(bstrName: Any, bstrCaption: Any): Page = js.native
  def Add(bstrName: Any, bstrCaption: Any, lIndex: Any): Page = js.native
  def Add(bstrName: Any, bstrCaption: Unit, lIndex: Any): Page = js.native
  def Add(bstrName: Unit, bstrCaption: Any): Page = js.native
  def Add(bstrName: Unit, bstrCaption: Any, lIndex: Any): Page = js.native
  def Add(bstrName: Unit, bstrCaption: Unit, lIndex: Any): Page = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Enum(): Any = js.native
  
  def Item(varg: Any): Any = js.native
  
  def Remove(varg: Any): Unit = js.native
  
  def _AddCtrl(clsid: Double, bstrName: String, bstrCaption: String): Page = js.native
  
  def _GetItemByIndex(lIndex: Double): Control = js.native
  
  def _GetItemByName(pstrName: String): Control = js.native
  
  def _InsertCtrl(clsid: Double, bstrName: String, bstrCaption: String, lIndex: Double): Page = js.native
}
