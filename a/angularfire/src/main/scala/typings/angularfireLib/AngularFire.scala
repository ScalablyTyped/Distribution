package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated. Not possible with AngularFire 1.0+
  */
@js.native
trait AngularFire extends js.Object {
  @JSName("$asArray")
  def $asArray(): AngularFireArray = js.native
  @JSName("$asObject")
  def $asObject(): AngularFireObject = js.native
  @JSName("$push")
  def $push(data: js.Any): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$ref")
  def $ref(): js.Any = js.native
  @JSName("$remove")
  def $remove(): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$remove")
  def $remove(key: java.lang.String): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$set")
  def $set(data: js.Any): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$set")
  def $set(key: java.lang.String, data: js.Any): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$transaction")
  def $transaction(key: java.lang.String, updateFn: js.Function1[/* currentData */ js.Any, _]): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ _
  ] = js.native
  @JSName("$transaction")
  def $transaction(
    key: java.lang.String,
    updateFn: js.Function1[/* currentData */ js.Any, _],
    applyLocally: scala.Boolean
  ): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ _
  ] = js.native
  @JSName("$transaction")
  def $transaction(updateFn: js.Function1[/* currentData */ js.Any, _]): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ _
  ] = js.native
  @JSName("$transaction")
  def $transaction(updateFn: js.Function1[/* currentData */ js.Any, _], applyLocally: scala.Boolean): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ _
  ] = js.native
  @JSName("$update")
  def $update(data: js.Any): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
  @JSName("$update")
  def $update(key: java.lang.String, data: js.Object): angularLib.angularMod.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ _
  ] = js.native
}

