package typings.acl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.mongodb.mod.Db
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.redis.mod.RedisClient
import typings.std.Error
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("acl", JSImport.Namespace)
  @js.native
  val ^ : AclStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("acl", JSImport.Namespace)
  @js.native
  class Class protected () extends Acl {
    def this(backend: Backend[_]) = this()
    def this(backend: Backend[_], logger: Logger) = this()
    def this(backend: Backend[_], logger: js.UndefOr[scala.Nothing], options: Option) = this()
    def this(backend: Backend[_], logger: Logger, options: Option) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "memoryBackend")
  @js.native
  class memoryBackend ()
    extends Backend[js.Array[Action]]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "mongodbBackend")
  @js.native
  class mongodbBackend protected () extends Backend[Callback] {
    def this(db: Db) = this()
    def this(db: Db, prefix: String) = this()
    def this(db: Db, prefix: js.UndefOr[scala.Nothing], useSingle: Boolean) = this()
    def this(db: Db, prefix: String, useSingle: Boolean) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "redisBackend")
  @js.native
  class redisBackend protected () extends Backend[RedisClient] {
    def this(redis: RedisClient) = this()
    def this(redis: RedisClient, prefix: String) = this()
  }
  
  @js.native
  trait Acl extends StObject {
    
    def addRoleParents(role: String, parents: Values): typings.bluebird.mod.^[Unit] = js.native
    def addRoleParents(role: String, parents: Values, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def addUserRoles(userId: Value, roles: strings): typings.bluebird.mod.^[Unit] = js.native
    def addUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def allow(aclSets: js.Array[AclSet]): typings.bluebird.mod.^[Unit] = js.native
    def allow(aclSets: AclSet): typings.bluebird.mod.^[Unit] = js.native
    def allow(roles: Values, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
    def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def allowedPermissions(userId: Value, resources: strings): typings.bluebird.mod.^[Unit] = js.native
    def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): typings.bluebird.mod.^[Unit] = js.native
    
    def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typings.bluebird.mod.^[_] = js.native
    def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[_] = js.native
    
    def hasRole(userId: Value, role: String): typings.bluebird.mod.^[Boolean] = js.native
    def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ Error, /* isInRole */ Boolean, _]): typings.bluebird.mod.^[Boolean] = js.native
    
    def isAllowed(userId: Value, resources: strings, permissions: strings): typings.bluebird.mod.^[Boolean] = js.native
    def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[Boolean] = js.native
    
    def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: js.UndefOr[Value], actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: GetUserId): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: js.UndefOr[scala.Nothing], userId: Value): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: Double, userId: js.UndefOr[Value], actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(numPathComponents: Double, userId: Value): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def permittedResources(roles: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
    def permittedResources(roles: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def removeAllow(role: String, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
    def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def removePermissions(role: String, resources: strings, permissions: strings): typings.bluebird.mod.^[Unit] = js.native
    def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def removeResource(resource: String): typings.bluebird.mod.^[Unit] = js.native
    def removeResource(resource: String, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def removeRole(role: String): typings.bluebird.mod.^[Unit] = js.native
    def removeRole(role: String, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def removeUserRoles(userId: Value, roles: strings): typings.bluebird.mod.^[Unit] = js.native
    def removeUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.mod.^[Unit] = js.native
    
    def roleUsers(role: Value): typings.bluebird.mod.^[_] = js.native
    def roleUsers(role: Value, cb: js.Function2[/* err */ Error, /* users */ Values, _]): typings.bluebird.mod.^[_] = js.native
    
    def userRoles(userId: Value): typings.bluebird.mod.^[js.Array[String]] = js.native
    def userRoles(userId: Value, cb: js.Function2[/* err */ Error, /* roles */ js.Array[String], _]): typings.bluebird.mod.^[js.Array[String]] = js.native
    
    def whatResources(roles: strings): typings.bluebird.mod.^[_] = js.native
    def whatResources(roles: strings, cb: AnyCallback): typings.bluebird.mod.^[_] = js.native
    def whatResources(roles: strings, permissions: strings): typings.bluebird.mod.^[_] = js.native
    def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typings.bluebird.mod.^[_] = js.native
  }
  
  @js.native
  trait AclAllow extends StObject {
    
    var permissions: strings = js.native
    
    var resources: strings = js.native
  }
  object AclAllow {
    
    @scala.inline
    def apply(permissions: strings, resources: strings): AclAllow = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclAllow]
    }
    
    @scala.inline
    implicit class AclAllowMutableBuilder[Self <: AclAllow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPermissions(value: strings): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setResources(value: strings): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AclSet extends StObject {
    
    var allows: js.Array[AclAllow] = js.native
    
    var roles: strings = js.native
  }
  object AclSet {
    
    @scala.inline
    def apply(allows: js.Array[AclAllow], roles: strings): AclSet = {
      val __obj = js.Dynamic.literal(allows = allows.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclSet]
    }
    
    @scala.inline
    implicit class AclSetMutableBuilder[Self <: AclSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllows(value: js.Array[AclAllow]): Self = StObject.set(x, "allows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowsVarargs(value: AclAllow*): Self = StObject.set(x, "allows", js.Array(value :_*))
      
      @scala.inline
      def setRoles(value: strings): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AclStatic
    extends Instantiable1[/* backend */ Backend[js.Any], Acl]
       with Instantiable2[/* backend */ Backend[js.Any], /* logger */ Logger, Acl]
       with Instantiable3[
          /* backend */ Backend[js.Any], 
          js.UndefOr[/* logger */ Logger], 
          /* options */ Option, 
          Acl
        ] {
    
    val memoryBackend: MemoryBackendStatic = js.native
    
    val mongodbBackend: MongodbBackendStatic = js.native
    
    val redisBackend: RedisBackendStatic = js.native
  }
  
  type Action = js.Function0[js.Any]
  
  type AllowedCallback = js.Function2[/* err */ Error, /* allowed */ Boolean, js.Any]
  
  type AnyCallback = js.Function2[/* err */ Error, /* obj */ js.Any, js.Any]
  
  //
  // For internal use
  //
  @js.native
  trait Backend[T] extends StObject {
    
    def add(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
    
    def begin(): T = js.native
    
    def clean(): Unit = js.native
    def clean(cb: Action): Unit = js.native
    
    def cleanAsync(): typings.bluebird.mod.^[Unit] = js.native
    def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    def del(transaction: T, bucket: String, keys: js.Array[Value]): Unit = js.native
    
    def end(transaction: T): Unit = js.native
    def end(transaction: T, cb: Action): Unit = js.native
    
    def endAsync(transaction: T): typings.bluebird.mod.^[Unit] = js.native
    def endAsync(transaction: T, cb: js.Function1[/* err */ Error | Null, Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    def get(bucket: String, key: Value): Unit = js.native
    def get(bucket: String, key: Value, cb: Action): Unit = js.native
    
    def getAsync(bucket: String, key: Value): typings.bluebird.mod.^[_] = js.native
    def getAsync(bucket: String, key: Value, cb: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]): typings.bluebird.mod.^[_] = js.native
    
    def remove(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
    
    def union(bucket: String, keys: js.Array[Value]): Unit = js.native
    def union(bucket: String, keys: js.Array[Value], cb: Action): Unit = js.native
    
    def unionAsync(bucket: String, keys: js.Array[Value]): typings.bluebird.mod.^[js.Array[_]] = js.native
    def unionAsync(
      bucket: String,
      keys: js.Array[Value],
      cb: js.Function2[/* error */ js.UndefOr[Error], /* results */ js.Array[_], Unit]
    ): typings.bluebird.mod.^[js.Array[_]] = js.native
  }
  
  @js.native
  trait BucketsOption extends StObject {
    
    var meta: js.UndefOr[String] = js.native
    
    var parents: js.UndefOr[String] = js.native
    
    var permissions: js.UndefOr[String] = js.native
    
    var resources: js.UndefOr[String] = js.native
    
    var roles: js.UndefOr[String] = js.native
    
    var users: js.UndefOr[String] = js.native
  }
  object BucketsOption {
    
    @scala.inline
    def apply(): BucketsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketsOption]
    }
    
    @scala.inline
    implicit class BucketsOptionMutableBuilder[Self <: BucketsOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setParents(value: String): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      @scala.inline
      def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setResources(value: String): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* err */ js.UndefOr[Error], js.Any]
  
  @js.native
  trait Contract extends StObject {
    
    def apply(args: IArguments): Contract | NoOp = js.native
    
    var args: js.Array[_] = js.native
    
    var checkedParams: js.Array[String] = js.native
    
    var debug: Boolean = js.native
    
    def end(): Unit = js.native
    
    var fulfilled: Boolean = js.native
    
    def params(types: String*): Contract | NoOp = js.native
  }
  
  type GetUserId = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Value]
  
  @js.native
  trait Logger extends StObject {
    
    def debug(msg: String): js.Any = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(debug: String => js.Any): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String => js.Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    }
  }
  
  type MemoryBackend = Backend[js.Array[Action]]
  
  @js.native
  trait MemoryBackendStatic extends Instantiable0[MemoryBackend]
  
  // for mongodb backend
  type MongodbBackend = Backend[Callback]
  
  @js.native
  trait MongodbBackendStatic
    extends Instantiable1[/* db */ Db, MongodbBackend]
       with Instantiable2[/* db */ Db, /* prefix */ String, MongodbBackend]
       with Instantiable3[/* db */ Db, js.UndefOr[/* prefix */ String], /* useSingle */ Boolean, MongodbBackend]
  
  @js.native
  trait NoOp extends StObject {
    
    def end(): Unit = js.native
    
    def params(types: String*): NoOp = js.native
  }
  object NoOp {
    
    @scala.inline
    def apply(end: () => Unit, params: /* repeated */ String => NoOp): NoOp = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
      __obj.asInstanceOf[NoOp]
    }
    
    @scala.inline
    implicit class NoOpMutableBuilder[Self <: NoOp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParams(value: /* repeated */ String => NoOp): Self = StObject.set(x, "params", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    var buckets: js.UndefOr[BucketsOption] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuckets(value: BucketsOption): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    }
  }
  
  // for redis backend
  type RedisBackend = Backend[RedisClient]
  
  @js.native
  trait RedisBackendStatic
    extends Instantiable1[/* redis */ RedisClient, RedisBackend]
       with Instantiable2[/* redis */ RedisClient, /* prefix */ String, RedisBackend]
  
  type Value = String | Double
  
  type Values = Value | js.Array[Value]
  
  type _To = AclStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AclStatic = ^
  
  type strings = String | js.Array[String]
}
