package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describe the contents of a layer to an {@link XLayerHandler} object. The contents of the layer is contained in the sequence of {@link PropertyInfo}
  * structures
  * @see PropertyInfo
  */
trait XLayerContentDescriber
  extends StObject
     with XInterface {
  
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @param aPropertyInfos sequence of {@link PropertyInfo} structs contained all required property information
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def describeLayer(aHandler: XLayerHandler, aPropertyInfos: SeqEquiv[PropertyInfo]): Unit
}
object XLayerContentDescriber {
  
  inline def apply(
    acquire: () => Unit,
    describeLayer: (XLayerHandler, SeqEquiv[PropertyInfo]) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XLayerContentDescriber = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), describeLayer = js.Any.fromFunction2(describeLayer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayerContentDescriber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLayerContentDescriber] (val x: Self) extends AnyVal {
    
    inline def setDescribeLayer(value: (XLayerHandler, SeqEquiv[PropertyInfo]) => Unit): Self = StObject.set(x, "describeLayer", js.Any.fromFunction2(value))
  }
}
