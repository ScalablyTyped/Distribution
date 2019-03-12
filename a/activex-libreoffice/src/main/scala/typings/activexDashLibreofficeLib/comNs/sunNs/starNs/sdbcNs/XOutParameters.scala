package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to register Out-Parameters for stored procedures.
  *
  * SDBC provides a stored procedure SQL escape that allows stored procedures to be called in a standard way for all RDBMSs. This escape syntax has one
  * form that includes a result parameter and one that does not. If used, the result parameter must be registered as an OUT parameter. The other
  * parameters can be used for input, output, or both. Parameters are referred to sequentially, by number. The first parameter is 1.
  */
trait XOutParameters
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers the OUT parameter in ordinal position `parameterIndex` to the SDBC type `sqlType` . All OUT parameters must be registered before a stored
    * procedure is executed.
    *
    * The SDBC type specified by `sqlType` for an OUT parameter determines the type that must be used in the `get` method to read the value of that
    * parameter. This version of {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} should be used when the parameter is of SDBC type {@link
    * com.sun.star.sdbc.DataType.NUMERIC} or {@link com.sun.star.sdbc.DataType.DECIMAL} .
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to register
    * @param scale the scale of the type
    * @throws SQLException if a database access error occurs.
    */
  def registerNumericOutParameter(parameterIndex: scala.Double, sqlType: scala.Double, scale: scala.Double): scala.Unit
  /**
    * registers the designated output parameter. This version of the method {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} should be used
    * for a user-named or REF output parameter. Examples of user-named types include: STRUCT, DISTINCT, OBJECT, and named array types.
    *
    * Before executing a stored procedure call, you must explicitly call {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} to register the
    * type from {@link com.sun.star.sdbc.DataType} for each OUT parameter. ;  For a user-named parameter the fully-qualified SQL type name of the parameter
    * should also be given, while a REF parameter requires that the fully-qualified type name of the referenced type be given. An SDBC driver that does not
    * need the type code and type name information may ignore it. To be portable, however, applications should always provide these values for user-named
    * and REF parameters.
    *
    * Although it is intended for user-named and REF parameters, this method may be used to register a parameter of any SDBC type. If the parameter does not
    * have a user-named or REF type, the typeName parameter is ignored.
    *
    * **Note:** When reading the value of an out parameter, you must use the `getXXX` method whose type XXX corresponds to the parameter's registered SQL
    * type.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to register
    * @param typeName the name of the type
    * @throws SQLException if a database access error occurs.
    */
  def registerOutParameter(parameterIndex: scala.Double, sqlType: scala.Double, typeName: java.lang.String): scala.Unit
}

object XOutParameters {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerNumericOutParameter: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    registerOutParameter: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    release: () => scala.Unit
  ): XOutParameters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), registerNumericOutParameter = js.Any.fromFunction3(registerNumericOutParameter), registerOutParameter = js.Any.fromFunction3(registerOutParameter), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XOutParameters]
  }
}

