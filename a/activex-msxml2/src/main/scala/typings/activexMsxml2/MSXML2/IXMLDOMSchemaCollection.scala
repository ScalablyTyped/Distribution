package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XML Schemas Collection */
// tslint:disable-next-line:interface-name
@js.native
trait IXMLDOMSchemaCollection extends StObject {
  
  /** Get namespaceURI for schema by index */
  def apply(index: Double): String = js.native
  
  /** add a new schema */
  def add(namespaceURI: String, var_1: js.Any): Unit = js.native
  
  /** copy & merge other collection into this one */
  def addCollection(otherCollection: IXMLDOMSchemaCollection): Unit = js.native
  
  /** lookup schema by namespaceURI */
  def get(namespaceURI: String): IXMLDOMNode = js.native
  
  /** number of schemas in collection */
  val length: Double = js.native
  
  /** Get namespaceURI for schema by index */
  def namespaceURI(index: Double): String = js.native
  
  /** remove schema by namespaceURI */
  def remove(namespaceURI: String): Unit = js.native
}
