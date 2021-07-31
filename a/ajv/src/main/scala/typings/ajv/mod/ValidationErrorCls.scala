package typings.ajv.mod

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("ajv", "ValidationError")
@js.native
class ValidationErrorCls protected ()
  extends StObject
     with typings.ajv.mod.AjvErrors.ValidationError {
  def this(errors: js.Array[ErrorObject]) = this()
  
  /* CompleteClass */
  var ajv: `true` = js.native
  
  /* CompleteClass */
  var errors: js.Array[ErrorObject] = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var validation: `true` = js.native
}
