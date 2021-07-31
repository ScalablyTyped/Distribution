package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XML Schema Item Collection */
// tslint:disable-next-line:interface-name
@js.native
trait ISchemaItemCollection extends StObject {
  
  def apply(index: Double): ISchemaItem = js.native
  
  def item(index: Double): ISchemaItem = js.native
  
  def itemByName(name: String): ISchemaItem = js.native
  
  def itemByQName(name: String, namespaceURI: String): ISchemaItem = js.native
  
  val length: Double = js.native
}
