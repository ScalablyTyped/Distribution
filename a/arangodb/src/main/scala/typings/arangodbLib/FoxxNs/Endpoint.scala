package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  def body(description: java.lang.String): this.type = js.native
  def body(schemaOrMimes: Model, description: java.lang.String): this.type = js.native
  def body(schemaOrMimes: Schema, description: java.lang.String): this.type = js.native
  def body(schemaOrMimes: js.Array[Model | java.lang.String], description: java.lang.String): this.type = js.native
  def body(schema: Model): this.type = js.native
  def body(schema: Model, mimes: js.Array[java.lang.String]): this.type = js.native
  def body(schema: Model, mimes: js.Array[java.lang.String], description: java.lang.String): this.type = js.native
  def body(schema: Schema): this.type = js.native
  def body(schema: Schema, mimes: js.Array[java.lang.String]): this.type = js.native
  def body(schema: Schema, mimes: js.Array[java.lang.String], description: java.lang.String): this.type = js.native
  def body(schema: js.Array[Model | java.lang.String]): this.type = js.native
  def body(schema: js.Array[Model], mimes: js.Array[java.lang.String]): this.type = js.native
  def body(schema: js.Array[Model], mimes: js.Array[java.lang.String], description: java.lang.String): this.type = js.native
  def deprecated(deprecated: scala.Boolean): this.type = js.native
  def description(description: java.lang.String): this.type = js.native
  def error(status: arangodbLib.ArangoDBNs.HttpStatus, description: java.lang.String): this.type = js.native
  def error(status: scala.Double, description: java.lang.String): this.type = js.native
  def header(name: java.lang.String, description: java.lang.String): this.type = js.native
  def header(name: java.lang.String, schema: Schema): this.type = js.native
  def header(name: java.lang.String, schema: Schema, description: java.lang.String): this.type = js.native
  def pathParam(name: java.lang.String, description: java.lang.String): this.type = js.native
  def pathParam(name: java.lang.String, schema: Schema): this.type = js.native
  def pathParam(name: java.lang.String, schema: Schema, description: java.lang.String): this.type = js.native
  def queryParam(name: java.lang.String, description: java.lang.String): this.type = js.native
  def queryParam(name: java.lang.String, schema: Schema): this.type = js.native
  def queryParam(name: java.lang.String, schema: Schema, description: java.lang.String): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, description: java.lang.String): this.type = js.native
  def response(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, schema: Model): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, schema: Model, mimes: js.Array[java.lang.String]): this.type = js.native
  def response(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    schema: Model,
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, schema: Schema): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, schema: Schema, mimes: js.Array[java.lang.String]): this.type = js.native
  def response(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    schema: Schema,
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: arangodbLib.ArangoDBNs.HttpStatus, schema: js.Array[Model | java.lang.String]): this.type = js.native
  def response(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    schema: js.Array[Model],
    mimes: js.Array[java.lang.String]
  ): this.type = js.native
  def response(
    status: arangodbLib.ArangoDBNs.HttpStatus,
    schema: js.Array[Model],
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: scala.Double, description: java.lang.String): this.type = js.native
  def response(status: scala.Double, mimes: js.Array[java.lang.String], description: java.lang.String): this.type = js.native
  def response(status: scala.Double, schema: Model): this.type = js.native
  def response(status: scala.Double, schema: Model, mimes: js.Array[java.lang.String]): this.type = js.native
  def response(
    status: scala.Double,
    schema: Model,
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: scala.Double, schema: Schema): this.type = js.native
  def response(status: scala.Double, schema: Schema, mimes: js.Array[java.lang.String]): this.type = js.native
  def response(
    status: scala.Double,
    schema: Schema,
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def response(status: scala.Double, schema: js.Array[Model | java.lang.String]): this.type = js.native
  def response(status: scala.Double, schema: js.Array[Model], mimes: js.Array[java.lang.String]): this.type = js.native
  def response(
    status: scala.Double,
    schema: js.Array[Model],
    mimes: js.Array[java.lang.String],
    description: java.lang.String
  ): this.type = js.native
  def summary(summary: java.lang.String): this.type = js.native
  def tag(tags: java.lang.String*): this.type = js.native
}

