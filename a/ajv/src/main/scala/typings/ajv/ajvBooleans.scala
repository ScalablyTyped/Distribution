package typings.ajv

import typings.ajv.typesJtdSchemaMod.IsElements
import typings.ajv.typesJtdSchemaMod.IsEnum
import typings.ajv.typesJtdSchemaMod.IsRecord
import typings.ajv.typesJtdSchemaMod.IsUnion_
import typings.ajv.typesJtdSchemaMod.TypeEquality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajvBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with IsElements[Any]
       with IsEnum[Any]
       with IsRecord[Any, Any]
       with IsUnion_[Any, Any]
       with TypeEquality[Any, Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with IsElements[Any]
       with IsEnum[Any]
       with IsRecord[Any, Any]
       with IsUnion_[Any, Any]
       with TypeEquality[Any, Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
