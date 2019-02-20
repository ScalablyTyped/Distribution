package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentType extends XNode {
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  val Entities: XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  val InternalSubset: java.lang.String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  val Name: java.lang.String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  val Notations: XNamedNodeMap
  /** The public identifier of the external subset. */
  val PublicId: java.lang.String
  /** The system identifier of the external subset. */
  val SystemId: java.lang.String
  /** A NamedNodeMap containing the general entities, both external and internal, declared in the DTD. */
  def getEntities(): XNamedNodeMap
  /** The internal subset as a string, or null if there is none. */
  def getInternalSubset(): java.lang.String
  /** The name of DTD; i.e., the name immediately following the DOCTYPE keyword. */
  def getName(): java.lang.String
  /** A NamedNodeMap containing the notations declared in the DTD. */
  def getNotations(): XNamedNodeMap
  /** The public identifier of the external subset. */
  def getPublicId(): java.lang.String
  /** The system identifier of the external subset. */
  def getSystemId(): java.lang.String
}

