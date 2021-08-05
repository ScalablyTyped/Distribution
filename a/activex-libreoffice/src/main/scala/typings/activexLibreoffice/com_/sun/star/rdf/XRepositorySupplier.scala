package typings.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to an RDF {@link Repository} .
  * @see XRepository
  * @since OOo 3.0
  */
trait XRepositorySupplier extends StObject {
  
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  val RDFRepository: XRepository
  
  /**
    * provides the RDF {@link Repository} associated with this object.
    * @returns an object of type {@link XRepository}
    */
  def getRDFRepository(): XRepository
}
object XRepositorySupplier {
  
  inline def apply(RDFRepository: XRepository, getRDFRepository: () => XRepository): XRepositorySupplier = {
    val __obj = js.Dynamic.literal(RDFRepository = RDFRepository.asInstanceOf[js.Any], getRDFRepository = js.Any.fromFunction0(getRDFRepository))
    __obj.asInstanceOf[XRepositorySupplier]
  }
  
  extension [Self <: XRepositorySupplier](x: Self) {
    
    inline def setGetRDFRepository(value: () => XRepository): Self = StObject.set(x, "getRDFRepository", js.Any.fromFunction0(value))
    
    inline def setRDFRepository(value: XRepository): Self = StObject.set(x, "RDFRepository", value.asInstanceOf[js.Any])
  }
}
