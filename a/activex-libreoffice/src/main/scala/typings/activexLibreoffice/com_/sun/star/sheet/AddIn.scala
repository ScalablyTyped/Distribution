package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XServiceName
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the base for {@link AddIn} services that supply functions which can be called by other components.
  *
  * Any {@link AddIn} implementation must implement a service describing its specific set of functions. That service must contain the {@link AddIn}
  * service, and the functions that are implemented, in one or more interfaces. The {@link com.sun.star.lang.XServiceName} interface must describe that
  * service, and the {@link XAddIn} interface must describe the individual functions.
  *
  * Each {@link AddIn} function can take parameters of the following types:
  *
  * **long**: for integer values.;
  *
  * **double**: for floating point values.;
  *
  * **string**: for text strings.;
  *
  * **long[][]**: for (two-dimensional) arrays of integer values.;
  *
  * **double[][]**: for (two-dimensional) arrays of floating point values.;
  *
  * **string[][]**: for (two-dimensional) arrays of text strings.;
  *
  * **any[][]**: for (two-dimensional) arrays of mixed contents. Each `any` will contain a `double` or a `string` , depending on the data.;
  *
  * **any**: Depending on the data, a `double` , a `string` , or an `any[][]` will be passed. If no argument is specified in the function call, `VOID`
  * will be passed. This allows for optional parameters.;
  *
  * **com::sun::star::table::XCellRange**: for a {@link com.sun.star.table.XCellRange} interface to the source data.;
  *
  * **com::sun::star::beans::XPropertySet**: for a {@link com.sun.star.beans.XPropertySet} interface to the {@link SpreadsheetDocument} making the
  * function call. Only one parameter of this type is allowed in each function. It can be used to query document settings like {@link
  * SpreadsheetDocumentSettings.NullDate} .;
  *
  * **any[]**: for varying parameters. Only the last parameter of a function may have this type. It will be filled with the remaining arguments of the
  * function call that were not used for the previous parameters. Each element of the sequence will be filled as in the case of `any` above.
  *
  *
  *
  * Each {@link AddIn} function must have one of the following return types:
  *
  * `long``double``string``long[][]``double[][]``string[][]``any[][]`{@link XVolatileResult}`any`
  *
  * The sequences must contain arrays as described above for the parameter types. An {@link XVolatileResult} return value must contain an object
  * implementing the {@link VolatileResult} service, that contains a volatile result. Subsequent calls with the same parameters must return the same
  * object. An `any` return value can contain any of the other types.
  */
@js.native
trait AddIn
  extends XAddIn
     with XServiceName
     with XCompatibilityNames
object AddIn {
  
  @scala.inline
  def apply(
    Locale: Locale,
    ServiceName: String,
    acquire: () => Unit,
    getArgumentDescription: (String, Double) => String,
    getCompatibilityNames: String => SafeArray[LocalizedName],
    getDisplayArgumentName: (String, Double) => String,
    getDisplayCategoryName: String => String,
    getDisplayFunctionName: String => String,
    getFunctionDescription: String => String,
    getLocale: () => Locale,
    getProgrammaticCategoryName: String => String,
    getProgrammaticFuntionName: String => String,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLocale: Locale => Unit
  ): AddIn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArgumentDescription = js.Any.fromFunction2(getArgumentDescription), getCompatibilityNames = js.Any.fromFunction1(getCompatibilityNames), getDisplayArgumentName = js.Any.fromFunction2(getDisplayArgumentName), getDisplayCategoryName = js.Any.fromFunction1(getDisplayCategoryName), getDisplayFunctionName = js.Any.fromFunction1(getDisplayFunctionName), getFunctionDescription = js.Any.fromFunction1(getFunctionDescription), getLocale = js.Any.fromFunction0(getLocale), getProgrammaticCategoryName = js.Any.fromFunction1(getProgrammaticCategoryName), getProgrammaticFuntionName = js.Any.fromFunction1(getProgrammaticFuntionName), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[AddIn]
  }
}
