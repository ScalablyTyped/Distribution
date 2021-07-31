package typings.angularfire

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated. Not possible with AngularFire 1.0+
  */
@js.native
trait AngularFire extends StObject {
  
  @JSName("$asArray")
  def $asArray(): AngularFireArray = js.native
  
  @JSName("$asObject")
  def $asObject(): AngularFireObject = js.native
  
  @JSName("$push")
  def $push(data: js.Any): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  
  @JSName("$ref")
  def $ref(): js.Any = js.native
  
  @JSName("$remove")
  def $remove(): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  @JSName("$remove")
  def $remove(key: String): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  
  @JSName("$set")
  def $set(data: js.Any): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  @JSName("$set")
  def $set(key: String, data: js.Any): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  
  @JSName("$transaction")
  def $transaction(key: String, updateFn: js.Function1[/* currentData */ js.Any, js.Any]): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ js.Any
  ] = js.native
  @JSName("$transaction")
  def $transaction(key: String, updateFn: js.Function1[/* currentData */ js.Any, js.Any], applyLocally: Boolean): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ js.Any
  ] = js.native
  @JSName("$transaction")
  def $transaction(updateFn: js.Function1[/* currentData */ js.Any, js.Any]): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ js.Any
  ] = js.native
  @JSName("$transaction")
  def $transaction(updateFn: js.Function1[/* currentData */ js.Any, js.Any], applyLocally: Boolean): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseDataSnapshot */ js.Any
  ] = js.native
  
  @JSName("$update")
  def $update(data: js.Any): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
  @JSName("$update")
  def $update(key: String, data: js.Object): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ] = js.native
}
