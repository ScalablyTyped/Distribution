package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XFormField
  extends StObject
     with XInterface {
  
  var FieldType: String
  
  val Parameters: XNameContainer
  
  def getFieldType(): String
  
  def getParameters(): XNameContainer
  
  def setFieldType(fieldType: String): Unit
}
object XFormField {
  
  inline def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: () => Unit,
    getFieldType: () => String,
    getParameters: () => XNameContainer,
    queryInterface: `type` => Any,
    release: () => Unit,
    setFieldType: String => Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
    __obj.asInstanceOf[XFormField]
  }
  
  extension [Self <: XFormField](x: Self) {
    
    inline def setFieldType(value: String): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    inline def setGetFieldType(value: () => String): Self = StObject.set(x, "getFieldType", js.Any.fromFunction0(value))
    
    inline def setGetParameters(value: () => XNameContainer): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setParameters(value: XNameContainer): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setSetFieldType(value: String => Unit): Self = StObject.set(x, "setFieldType", js.Any.fromFunction1(value))
  }
}
