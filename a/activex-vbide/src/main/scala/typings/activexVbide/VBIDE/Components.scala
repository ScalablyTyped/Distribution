package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components extends StObject {
  
  def apply(index: Any): Component = js.native
  
  def Add(ComponentType: vbextComponentType): Component = js.native
  
  val Application: typings.activexVbide.VBIDE.Application = js.native
  
  val Count: Double = js.native
  
  def Import(FileName: String): Component = js.native
  
  def Item(index: Any): Component = js.native
  
  val Parent: VBProject = js.native
  
  def Remove(Component: Component): Unit = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
}
