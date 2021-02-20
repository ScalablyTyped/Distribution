package typings.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typings.ajv.mod.Ajv = typings.ajv.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.ajv.mod.Ajv]
  @scala.inline
  def apply(options: typings.ajv.mod.Options): typings.ajv.mod.Ajv = typings.ajv.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.ajv.mod.Ajv]
  
  type FormatValidator = java.lang.String | typings.std.RegExp | (js.Function1[/* data */ java.lang.String, scala.Boolean | js.Thenable[js.Any]])
  
  @scala.inline
  def MissingRefError: typings.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
    /* baseId */ java.lang.String, 
    /* ref */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.ajv.mod.AjvErrors.MissingRefError
  ]) = typings.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MissingRefError").asInstanceOf[typings.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
    /* baseId */ java.lang.String, 
    /* ref */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typings.ajv.mod.AjvErrors.MissingRefError
  ])]
  type MissingRefError = typings.ajv.mod.AjvErrors.MissingRefError
  @scala.inline
  def MissingRefError_=(
    x: typings.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
      /* baseId */ java.lang.String, 
      /* ref */ java.lang.String, 
      /* message */ js.UndefOr[java.lang.String], 
      typings.ajv.mod.AjvErrors.MissingRefError
    ])
  ): scala.Unit = typings.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("MissingRefError")(x.asInstanceOf[js.Any])
  
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | js.Thenable[js.Any]]
  
  @scala.inline
  def ValidationError: org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[typings.ajv.mod.ErrorObject], 
    typings.ajv.mod.AjvErrors.ValidationError
  ] = typings.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ValidationError").asInstanceOf[org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[typings.ajv.mod.ErrorObject], 
    typings.ajv.mod.AjvErrors.ValidationError
  ]]
  type ValidationError = typings.ajv.mod.AjvErrors.ValidationError
  @scala.inline
  def ValidationError_=(
    x: org.scalablytyped.runtime.Instantiable1[
      /* errors */ js.Array[typings.ajv.mod.ErrorObject], 
      typings.ajv.mod.AjvErrors.ValidationError
    ]
  ): scala.Unit = typings.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ValidationError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def dataMetaSchema: js.Object = typings.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$dataMetaSchema").asInstanceOf[js.Object]
  @scala.inline
  def dataMetaSchema_=(x: js.Object): scala.Unit = typings.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("$dataMetaSchema")(x.asInstanceOf[js.Any])
}
