package typings.arangodb.Foxx

import typings.arangodb.ArangoDB.HttpStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends StObject {
  
  def body(description: String): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schemaOrMimes: js.Array[Model | String],
    description: String
  ): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schemaOrMimes: Model, description: String): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schemaOrMimes: Schema,
    description: String
  ): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model | String]): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String]
  ): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: Unit,
    description: String
  ): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schema: Model): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schema: Model, mimes: js.Array[String]): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: Unit,
    description: String
  ): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schema: Schema): this.type = js.native
  def body(// eslint-disable-next-line no-single-element-tuple-type
  schema: Schema, mimes: js.Array[String]): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def body(
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: Unit,
    description: String
  ): this.type = js.native
  
  def deprecated(deprecated: Boolean): this.type = js.native
  
  def description(description: String): this.type = js.native
  
  def error(status: Double, description: String): this.type = js.native
  def error(status: HttpStatus, description: String): this.type = js.native
  
  def header(name: String, description: String): this.type = js.native
  def header(name: String, schema: Schema): this.type = js.native
  def header(name: String, schema: Schema, description: String): this.type = js.native
  
  def pathParam(name: String, description: String): this.type = js.native
  def pathParam(name: String, schema: Schema): this.type = js.native
  def pathParam(name: String, schema: Schema, description: String): this.type = js.native
  
  def queryParam(name: String, description: String): this.type = js.native
  def queryParam(name: String, schema: Schema): this.type = js.native
  def queryParam(name: String, schema: Schema, description: String): this.type = js.native
  
  def response(status: Double, description: String): this.type = js.native
  def response(status: Double, mimes: js.Array[String], description: String): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model | String]
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: Unit,
    description: String
  ): this.type = js.native
  def response(status: Double, // eslint-disable-next-line no-single-element-tuple-type
  schema: Model): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: Unit,
    description: String
  ): this.type = js.native
  def response(status: Double, // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: Double,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: Unit,
    description: String
  ): this.type = js.native
  def response(status: HttpStatus, description: String): this.type = js.native
  def response(status: HttpStatus, mimes: js.Array[String], description: String): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model | String]
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: js.Array[Model],
    mimes: Unit,
    description: String
  ): this.type = js.native
  def response(status: HttpStatus, // eslint-disable-next-line no-single-element-tuple-type
  schema: Model): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Model,
    mimes: Unit,
    description: String
  ): this.type = js.native
  def response(status: HttpStatus, // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: js.Array[String]
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: js.Array[String],
    description: String
  ): this.type = js.native
  def response(
    status: HttpStatus,
    // eslint-disable-next-line no-single-element-tuple-type
  schema: Schema,
    mimes: Unit,
    description: String
  ): this.type = js.native
  
  def summary(summary: String): this.type = js.native
  
  def tag(tags: String*): this.type = js.native
}
