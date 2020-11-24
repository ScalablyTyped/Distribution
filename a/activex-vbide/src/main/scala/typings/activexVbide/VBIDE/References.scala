package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait References extends js.Object {
  
  def apply(index: js.Any): Reference = js.native
  
  def AddFromFile(FileName: String): Reference = js.native
  
  def AddFromGuid(Guid: String, Major: Double, Minor: Double): Reference = js.native
  
  val Count: Double = js.native
  
  def Item(index: js.Any): Reference = js.native
  
  val Parent: VBProject = js.native
  
  def Remove(Reference: Reference): Unit = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
}
