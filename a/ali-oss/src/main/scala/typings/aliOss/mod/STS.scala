package typings.aliOss.mod

import typings.aliOss.anon.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generate STS Authorization
  */
@JSImport("ali-oss", "STS")
@js.native
open class STS protected () extends StObject {
  def this(options: STSOptions) = this()
  
  def assumeRole(roleArn: String): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(roleArn: String, /**
    * RAM Policy config object or valid JSON string
    */
  policy: String): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Double
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: String,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(roleArn: String, /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Double
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: js.Object,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Double
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Double,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: String,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
  def assumeRole(
    roleArn: String,
    /**
    * RAM Policy config object or valid JSON string
    */
  policy: Unit,
    // TODO: RAM policy type
  expirationSeconds: Unit,
    session: Unit,
    options: Ctx
  ): js.Promise[typings.aliOss.anon.Credentials] = js.native
}
