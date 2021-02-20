package typings.astTypes.anon

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Def extends StObject {
  
  def `def`(typeName: String): typings.astTypes.typesMod.Def[_] = js.native
  
  def from[T](value: js.Any): Type[T] = js.native
  def from[T](value: js.Any, name: String): Type[T] = js.native
  
  def hasDef(typeName: String): Boolean = js.native
  
  def or(types: js.Any*): Type[_] = js.native
}
