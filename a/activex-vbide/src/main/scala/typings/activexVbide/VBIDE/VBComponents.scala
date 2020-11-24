package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VBComponents extends js.Object {
  
  def apply(index: js.Any): VBComponent = js.native
  
  def Add(ComponentType: vbextComponentType): VBComponent = js.native
  
  def AddCustom(ProgId: String): VBComponent = js.native
  
  /** @param index [index=0] */
  def AddMTDesigner(): VBComponent = js.native
  def AddMTDesigner(index: Double): VBComponent = js.native
  
  val Count: Double = js.native
  
  def Import(FileName: String): VBComponent = js.native
  
  def Item(index: js.Any): VBComponent = js.native
  
  val Parent: VBProject = js.native
  
  def Remove(VBComponent: VBComponent): Unit = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
}
