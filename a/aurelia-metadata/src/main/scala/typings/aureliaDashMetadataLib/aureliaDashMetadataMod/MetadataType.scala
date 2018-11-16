package typings
package aureliaDashMetadataLib.aureliaDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataType extends js.Object {
  /**
      * The metadata key representing parameter type information.
      */
  var paramTypes: java.lang.String = js.native
  /**
      * The metadata key representing property information.
      */
  var properties: java.lang.String = js.native
  /**
      * The metadata key representing object property type information.
      */
  var propertyType: java.lang.String = js.native
  /**
      * The metadata key representing pluggable resources.
      */
  var resource: java.lang.String = js.native
  /**
      * Defines metadata specified by a key on a target.
      * @param metadataKey The key for the metadata to define.
      * @param target The target to set the metadata on.
      * @param targetKey The member on the target to set the metadata on.
      */
  def define(metadataKey: java.lang.String, metadataValue: js.Object, target: js.Function): scala.Unit = js.native
  /**
      * Defines metadata specified by a key on a target.
      * @param metadataKey The key for the metadata to define.
      * @param target The target to set the metadata on.
      * @param targetKey The member on the target to set the metadata on.
      */
  def define(
    metadataKey: java.lang.String,
    metadataValue: js.Object,
    target: js.Function,
    targetKey: java.lang.String
  ): scala.Unit = js.native
  /**
      * Gets metadata specified by a key on a target, searching up the inheritance hierarchy.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
  def get(metadataKey: java.lang.String, target: js.Function): js.Object = js.native
  /**
      * Gets metadata specified by a key on a target, searching up the inheritance hierarchy.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
  def get(metadataKey: java.lang.String, target: js.Function, targetKey: java.lang.String): js.Object = js.native
  /**
      * Gets metadata specified by a key on a target, or creates an instance of the specified metadata if not found.
      * @param metadataKey The key for the metadata to lookup or create.
      * @param Type The type of metadata to create if existing metadata is not found.
      * @param target The target to lookup or create the metadata on.
      * @param targetKey The member on the target to lookup or create the metadata on.
      */
  def getOrCreateOwn(metadataKey: java.lang.String, Type: js.Function, target: js.Function): js.Object = js.native
  /**
      * Gets metadata specified by a key on a target, or creates an instance of the specified metadata if not found.
      * @param metadataKey The key for the metadata to lookup or create.
      * @param Type The type of metadata to create if existing metadata is not found.
      * @param target The target to lookup or create the metadata on.
      * @param targetKey The member on the target to lookup or create the metadata on.
      */
  def getOrCreateOwn(metadataKey: java.lang.String, Type: js.Function, target: js.Function, targetKey: java.lang.String): js.Object = js.native
  /**
      * Gets metadata specified by a key on a target, only searching the own instance.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
  def getOwn(metadataKey: java.lang.String, target: js.Function): js.Object = js.native
  /**
      * Gets metadata specified by a key on a target, only searching the own instance.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
  def getOwn(metadataKey: java.lang.String, target: js.Function, targetKey: java.lang.String): js.Object = js.native
}

