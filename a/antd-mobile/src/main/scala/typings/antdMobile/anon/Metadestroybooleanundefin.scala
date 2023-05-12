package typings.antdMobile.anon

import typings.rcFieldForm.esInterfaceMod.InternalNamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-field-form.rc-field-form/es/interface.Meta & {  destroy :boolean | undefined} */
trait Metadestroybooleanundefin extends StObject {
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var errors: js.Array[String]
  
  var name: InternalNamePath
  
  var touched: Boolean
  
  var validated: Boolean
  
  var validating: Boolean
  
  var warnings: js.Array[String]
}
object Metadestroybooleanundefin {
  
  inline def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validated: Boolean,
    validating: Boolean,
    warnings: js.Array[String]
  ): Metadestroybooleanundefin = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadestroybooleanundefin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadestroybooleanundefin] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
