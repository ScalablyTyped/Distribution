package typings.astTypes.buildersMod

import typings.astTypes.anon.Leading
import typings.astTypes.namedTypesMod.namedTypes.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockBuilder extends StObject {
  
  def apply(value: String): Block = js.native
  def apply(value: String, leading: Boolean): Block = js.native
  def apply(value: String, leading: Boolean, trailing: Boolean): Block = js.native
  def apply(value: String, leading: Unit, trailing: Boolean): Block = js.native
  
  def from(params: Leading): Block = js.native
}
