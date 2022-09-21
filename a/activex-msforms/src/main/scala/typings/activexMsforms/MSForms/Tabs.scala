package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabs extends StObject {
  
  def apply(varg: Any): Any = js.native
  
  def Add(): Tab = js.native
  def Add(bstrName: Any): Tab = js.native
  def Add(bstrName: Any, bstrCaption: Any): Tab = js.native
  def Add(bstrName: Any, bstrCaption: Any, lIndex: Any): Tab = js.native
  def Add(bstrName: Any, bstrCaption: Unit, lIndex: Any): Tab = js.native
  def Add(bstrName: Unit, bstrCaption: Any): Tab = js.native
  def Add(bstrName: Unit, bstrCaption: Any, lIndex: Any): Tab = js.native
  def Add(bstrName: Unit, bstrCaption: Unit, lIndex: Any): Tab = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Enum(): Any = js.native
  
  def Item(varg: Any): Any = js.native
  
  def Remove(varg: Any): Unit = js.native
  
  def _Add(bstrName: String, bstrCaption: String): Tab = js.native
  
  def _GetItemByIndex(lIndex: Double): Tab = js.native
  
  def _GetItemByName(bstr: String): Tab = js.native
  
  def _Insert(bstrName: String, bstrCaption: String, lIndex: Double): Tab = js.native
}
