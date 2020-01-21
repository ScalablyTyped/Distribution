package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  val Application: typings.activexVbide.VBIDE.Application = js.native
  val Count: Double = js.native
  val Parent: VBProject = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  def apply(index: js.Any): Component = js.native
  def Add(ComponentType: vbextComponentType): Component = js.native
  def Import(FileName: String): Component = js.native
  def Item(index: js.Any): Component = js.native
  def Remove(Component: Component): Unit = js.native
}

