package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows extends js.Object {
  
  def apply(index: js.Any): Window = js.native
  
  val Count: Double = js.native
  
  def CreateToolWindow(AddInInst: AddIn, ProgId: String, Caption: String, GuidPosition: String, DocObj: js.Any): Window = js.native
  
  def Item(index: js.Any): Window = js.native
  
  val Parent: Application = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
}
