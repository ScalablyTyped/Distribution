package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
trait URI extends XURI {
  /**
    * creates an {@link URI} RDF node.
    * @param Value the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not represent a valid {@link URI}
    */
  def create(Value: java.lang.String): scala.Unit
  /**
    * creates an {@link URI} RDF node for a well-known {@link URI} .
    * @param Id the {@link URI} , represented as a constant from {@link URIs} .
    * @see URIs
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not a valid constant from {@link URIs}
    */
  def createKnown(Id: scala.Double): scala.Unit
  /**
    * creates an {@link URI} RDF node from namespace prefix and local name.
    * @param Namespace the namespace prefix of the {@link URI} , represented as `string` .
    * @param LocalName the local name of the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the arguments do not represent a valid {@link URI}
    */
  def createNS(Namespace: java.lang.String, LocalName: java.lang.String): scala.Unit
}

object URI {
  @scala.inline
  def apply(
    LocalName: java.lang.String,
    Namespace: java.lang.String,
    StringValue: java.lang.String,
    create: java.lang.String => scala.Unit,
    createKnown: scala.Double => scala.Unit,
    createNS: (java.lang.String, java.lang.String) => scala.Unit
  ): URI = {
    val __obj = js.Dynamic.literal(LocalName = LocalName, Namespace = Namespace, StringValue = StringValue, create = js.Any.fromFunction1(create), createKnown = js.Any.fromFunction1(createKnown), createNS = js.Any.fromFunction2(createNS))
  
    __obj.asInstanceOf[URI]
  }
}

