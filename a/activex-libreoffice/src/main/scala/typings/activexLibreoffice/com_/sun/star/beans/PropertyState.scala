package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enumeration lists the states that a property value can have.
  *
  * The state consists of two aspects:
  *
  *  1. whether a value is available or void, 2. whether the value is stored in the property set itself or is a default, or ambiguous.
  * @see XPropertyState
  * @see Property
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait PropertyState extends StObject
object PropertyState {
  
  /**
    * The value of the property is only a recommendation because there are multiple values for this property (e.g., from a multi selection).
    *
    * The {@link PropertyAttribute} field in the struct {@link Property} must contain the {@link PropertyAttribute.MAYBEAMBIGUOUS} flag. The property value
    * must be available and of the specified type. If the Attribute field in the struct {@link Property} contains {@link PropertyAttribute.MAYBEVOID} , then
    * the value may be void.
    */
  inline def AMBIGUOUS_VALUE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The value of the property is available from a master (e.g., template). <p>The PropertyAttribute field in the struct
    *
    * Property must contain the
    *
    * PropertyAttribute::MAYBEDEFAULT flag. The property
    *
    * value must be available and of the specified type. If the
    *
    * PropertyAttribute field in the struct Property
    *
    * contains PropertyAttribute::MAYBEVOID, then the
    *
    * value may be void. </p>
    */
  inline def DEFAULT_VALUE: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The value of the property is stored in the {@link PropertySet} itself. <p>The property value must be available and of the specified type.
    *
    * If the PropertyAttribute field in the struct
    *
    * Property contains PropertyAttribute::MAYBEVOID,
    *
    * then the value may be void. </p>
    */
  inline def DIRECT_VALUE: `0` = 0.asInstanceOf[`0`]
}
