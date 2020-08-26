package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait URI extends XURI {
  /**
    * creates an {@link URI} RDF node.
    * @param Value the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the argument does not represent a valid {@link URI}
    */
  def create(Value: String): Unit = js.native
  /**
    * creates an {@link URI} RDF node for a well-known {@link URI} .
    * @param Id the {@link URI} , represented as a constant from {@link URIs} .
    * @see URIs
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not a valid constant from {@link URIs}
    */
  def createKnown(Id: Double): Unit = js.native
  /**
    * creates an {@link URI} RDF node from namespace prefix and local name.
    * @param Namespace the namespace prefix of the {@link URI} , represented as `string` .
    * @param LocalName the local name of the {@link URI} , represented as `string` .
    * @throws com::sun::star::lang::IllegalArgumentException if the arguments do not represent a valid {@link URI}
    */
  def createNS(Namespace: String, LocalName: String): Unit = js.native
}

object URI {
  @scala.inline
  def apply(
    LocalName: String,
    Namespace: String,
    StringValue: String,
    create: String => Unit,
    createKnown: Double => Unit,
    createNS: (String, String) => Unit
  ): URI = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), createKnown = js.Any.fromFunction1(createKnown), createNS = js.Any.fromFunction2(createNS))
    __obj.asInstanceOf[URI]
  }
  @scala.inline
  implicit class URIOps[Self <: URI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: String => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateKnown(value: Double => Unit): Self = this.set("createKnown", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateNS(value: (String, String) => Unit): Self = this.set("createNS", js.Any.fromFunction2(value))
  }
  
}

