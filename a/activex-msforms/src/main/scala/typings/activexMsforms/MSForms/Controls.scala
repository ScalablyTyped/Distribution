package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controls extends StObject {
  
  def apply(varg: Any): Any = js.native
  
  def Add(bstrProgID: String): Control = js.native
  def Add(bstrProgID: String, Name: Any): Control = js.native
  def Add(bstrProgID: String, Name: Any, Visible: Any): Control = js.native
  def Add(bstrProgID: String, Name: Unit, Visible: Any): Control = js.native
  
  def AlignToGrid(): Unit = js.native
  
  def BringForward(): Unit = js.native
  
  def BringToFront(): Unit = js.native
  
  def Clear(): Unit = js.native
  
  def Copy(): Unit = js.native
  
  val Count: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Enum(): Any = js.native
  
  def Item(varg: Any): Any = js.native
  
  def Move(cx: Double, cy: Double): Unit = js.native
  
  def Remove(varg: Any): Unit = js.native
  
  def SelectAll(): Unit = js.native
  
  def SendBackward(): Unit = js.native
  
  def SendToBack(): Unit = js.native
  
  def _AddByClass(clsid: Double): Control = js.native
  
  def _GetItemByID(ID: Double): Control = js.native
  
  def _GetItemByIndex(lIndex: Double): Control = js.native
  
  def _GetItemByName(pstr: String): Control = js.native
  
  def _Move(cx: Double, cy: Double): Unit = js.native
}
