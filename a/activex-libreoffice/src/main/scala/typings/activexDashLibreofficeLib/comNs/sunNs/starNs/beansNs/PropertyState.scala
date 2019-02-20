package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyState extends js.Object

/**
  * This enumeration lists the states that a property value can have.
  *
  * The state consists of two aspects:
  *
  *  1. whether a value is available or void, 2. whether the value is stored in the property set itself or is a default, or ambiguous.
  * @see XPropertyState
  * @see Property
  */
@JSGlobal("com.sun.star.beans.PropertyState")
@js.native
object PropertyState extends js.Object {
  /**
    * The value of the property is only a recommendation because there are multiple values for this property (e.g., from a multi selection).
    *
    * The {@link PropertyAttribute} field in the struct {@link Property} must contain the {@link PropertyAttribute.MAYBEAMBIGUOUS} flag. The property value
    * must be available and of the specified type. If the Attribute field in the struct {@link Property} contains {@link PropertyAttribute.MAYBEVOID} , then
    * the value may be void.
    */
  @js.native
  sealed trait AMBIGUOUS_VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
  
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
  @js.native
  sealed trait DEFAULT_VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
  
  /**
    * The value of the property is stored in the {@link PropertySet} itself. <p>The property value must be available and of the specified type.
    *
    * If the PropertyAttribute field in the struct
    *
    * Property contains PropertyAttribute::MAYBEVOID,
    *
    * then the value may be void. </p>
    */
  @js.native
  sealed trait DIRECT_VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
  
  /* 2 */ val AMBIGUOUS_VALUE: AMBIGUOUS_VALUE with scala.Double = js.native
  /* 1 */ val DEFAULT_VALUE: DEFAULT_VALUE with scala.Double = js.native
  /* 0 */ val DIRECT_VALUE: DIRECT_VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState with scala.Double
  ] = js.native
}

