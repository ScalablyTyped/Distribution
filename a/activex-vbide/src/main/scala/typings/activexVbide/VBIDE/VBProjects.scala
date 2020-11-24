package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VBProjects extends js.Object {
  
  def apply(index: js.Any): VBProject = js.native
  
  def Add(Type: vbextProjectType): VBProject = js.native
  
  val Count: Double = js.native
  
  def Item(index: js.Any): VBProject = js.native
  
  def Open(bstrPath: String): VBProject = js.native
  
  val Parent: typings.activexVbide.VBIDE.VBE = js.native
  
  def Remove(lpc: VBProject): Unit = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
}
