package typings.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class URIMutableBuilder[Self <: URI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateKnown(value: Double => Unit): Self = StObject.set(x, "createKnown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNS(value: (String, String) => Unit): Self = StObject.set(x, "createNS", js.Any.fromFunction2(value))
  }
}
