package typings.acl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.mongodb.mod.Db
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.IArguments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("acl", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AclStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("acl", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Acl {
    def this(backend: Backend[Any]) = this()
    def this(backend: Backend[Any], logger: Logger) = this()
    def this(backend: Backend[Any], logger: Unit, options: Option) = this()
    def this(backend: Backend[Any], logger: Logger, options: Option) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "memoryBackend")
  @js.native
  open class memoryBackend ()
    extends StObject
       with Backend[js.Array[Action]]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "mongodbBackend")
  @js.native
  open class mongodbBackend protected ()
    extends StObject
       with Backend[Callback] {
    def this(db: Db) = this()
    def this(db: Db, prefix: String) = this()
    def this(db: Db, prefix: String, useSingle: Boolean) = this()
    def this(db: Db, prefix: Unit, useSingle: Boolean) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("acl", "redisBackend")
  @js.native
  open class redisBackend protected ()
    extends StObject
       with Backend[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
        ] {
    def this(redis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any) = this()
    def this(
      redis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any,
      prefix: String
    ) = this()
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
    
    def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typings.bluebird.mod.^[Any] = js.native
    def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[Any] = js.native
    
    def hasRole(userId: Value, role: String): typings.bluebird.mod.^[Boolean] = js.native
    def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ js.Error, /* isInRole */ Boolean, Any]): typings.bluebird.mod.^[Boolean] = js.native
    
    def isAllowed(userId: Value, resources: strings, permissions: strings): typings.bluebird.mod.^[Boolean] = js.native
    def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.mod.^[Boolean] = js.native
    
    def middleware(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double, userId: Unit, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double, userId: Value): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Double, userId: Value, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Unit, userId: Unit, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Unit, userId: GetUserId): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Unit, userId: GetUserId, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Unit, userId: Value): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def middleware(numPathComponents: Unit, userId: Value, actions: strings): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
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
    
    def roleUsers(role: Value): typings.bluebird.mod.^[Any] = js.native
    def roleUsers(role: Value, cb: js.Function2[/* err */ js.Error, /* users */ Values, Any]): typings.bluebird.mod.^[Any] = js.native
    
    def userRoles(userId: Value): typings.bluebird.mod.^[js.Array[String]] = js.native
    def userRoles(userId: Value, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[String], Any]): typings.bluebird.mod.^[js.Array[String]] = js.native
    
    def whatResources(roles: strings): typings.bluebird.mod.^[Any] = js.native
    def whatResources(roles: strings, cb: AnyCallback): typings.bluebird.mod.^[Any] = js.native
    def whatResources(roles: strings, permissions: strings): typings.bluebird.mod.^[Any] = js.native
    def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typings.bluebird.mod.^[Any] = js.native
  }
  
  trait AclAllow extends StObject {
    
    var permissions: strings
    
    var resources: strings
  }
  object AclAllow {
    
    inline def apply(permissions: strings, resources: strings): AclAllow = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclAllow]
    }
    
    extension [Self <: AclAllow](x: Self) {
      
      inline def setPermissions(value: strings): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setResources(value: strings): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    }
  }
  
  trait AclSet extends StObject {
    
    var allows: js.Array[AclAllow]
    
    var roles: strings
  }
  object AclSet {
    
    inline def apply(allows: js.Array[AclAllow], roles: strings): AclSet = {
      val __obj = js.Dynamic.literal(allows = allows.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclSet]
    }
    
    extension [Self <: AclSet](x: Self) {
      
      inline def setAllows(value: js.Array[AclAllow]): Self = StObject.set(x, "allows", value.asInstanceOf[js.Any])
      
      inline def setAllowsVarargs(value: AclAllow*): Self = StObject.set(x, "allows", js.Array(value*))
      
      inline def setRoles(value: strings): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    }
  }
  
  @js.native
  trait AclStatic
    extends StObject
       with Instantiable1[/* backend */ Backend[Any], Acl]
       with Instantiable2[/* backend */ Backend[Any], /* logger */ Logger, Acl]
       with Instantiable3[
          /* backend */ Backend[Any], 
          (/* logger */ Logger) | (/* logger */ Unit), 
          /* options */ Option, 
          Acl
        ] {
    
    val memoryBackend: MemoryBackendStatic = js.native
    
    val mongodbBackend: MongodbBackendStatic = js.native
    
    val redisBackend: RedisBackendStatic = js.native
  }
  
  type Action = js.Function0[Any]
  
  type AllowedCallback = js.Function2[/* err */ js.Error, /* allowed */ Boolean, Any]
  
  type AnyCallback = js.Function2[/* err */ js.Error, /* obj */ Any, Any]
  
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
    def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    def del(transaction: T, bucket: String, keys: js.Array[Value]): Unit = js.native
    
    def end(transaction: T): Unit = js.native
    def end(transaction: T, cb: Action): Unit = js.native
    
    def endAsync(transaction: T): typings.bluebird.mod.^[Unit] = js.native
    def endAsync(transaction: T, cb: js.Function1[/* err */ js.Error | Null, Unit]): typings.bluebird.mod.^[Unit] = js.native
    
    def get(bucket: String, key: Value): Unit = js.native
    def get(bucket: String, key: Value, cb: Action): Unit = js.native
    
    def getAsync(bucket: String, key: Value): typings.bluebird.mod.^[Any] = js.native
    def getAsync(bucket: String, key: Value, cb: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]): typings.bluebird.mod.^[Any] = js.native
    
    def remove(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
    
    def union(bucket: String, keys: js.Array[Value]): Unit = js.native
    def union(bucket: String, keys: js.Array[Value], cb: Action): Unit = js.native
    
    def unionAsync(bucket: String, keys: js.Array[Value]): typings.bluebird.mod.^[js.Array[Any]] = js.native
    def unionAsync(
      bucket: String,
      keys: js.Array[Value],
      cb: js.Function2[/* error */ js.UndefOr[js.Error], /* results */ js.Array[Any], Unit]
    ): typings.bluebird.mod.^[js.Array[Any]] = js.native
  }
  
  trait BucketsOption extends StObject {
    
    var meta: js.UndefOr[String] = js.undefined
    
    var parents: js.UndefOr[String] = js.undefined
    
    var permissions: js.UndefOr[String] = js.undefined
    
    var resources: js.UndefOr[String] = js.undefined
    
    var roles: js.UndefOr[String] = js.undefined
    
    var users: js.UndefOr[String] = js.undefined
  }
  object BucketsOption {
    
    inline def apply(): BucketsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketsOption]
    }
    
    extension [Self <: BucketsOption](x: Self) {
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setParents(value: String): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setResources(value: String): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], Any]
  
  @js.native
  trait Contract extends StObject {
    
    def apply(args: IArguments): Contract | NoOp = js.native
    
    var args: js.Array[Any] = js.native
    
    var checkedParams: js.Array[String] = js.native
    
    var debug: Boolean = js.native
    
    def end(): Unit = js.native
    
    var fulfilled: Boolean = js.native
    
    def params(types: String*): Contract | NoOp = js.native
  }
  
  type GetUserId = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Value]
  
  trait Logger extends StObject {
    
    def debug(msg: String): Any
  }
  object Logger {
    
    inline def apply(debug: String => Any): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: String => Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    }
  }
  
  type MemoryBackend = Backend[js.Array[Action]]
  
  @js.native
  trait MemoryBackendStatic
    extends StObject
       with Instantiable0[MemoryBackend]
  
  // for mongodb backend
  type MongodbBackend = Backend[Callback]
  
  @js.native
  trait MongodbBackendStatic
    extends StObject
       with Instantiable1[/* db */ Db, MongodbBackend]
       with Instantiable2[/* db */ Db, /* prefix */ String, MongodbBackend]
       with Instantiable3[
          /* db */ Db, 
          (/* prefix */ String) | (/* prefix */ Unit), 
          /* useSingle */ Boolean, 
          MongodbBackend
        ]
  
  trait NoOp extends StObject {
    
    def end(): Unit
    
    def params(types: String*): NoOp
  }
  object NoOp {
    
    inline def apply(end: () => Unit, params: /* repeated */ String => NoOp): NoOp = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
      __obj.asInstanceOf[NoOp]
    }
    
    extension [Self <: NoOp](x: Self) {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setParams(value: /* repeated */ String => NoOp): Self = StObject.set(x, "params", js.Any.fromFunction1(value))
    }
  }
  
  trait Option extends StObject {
    
    var buckets: js.UndefOr[BucketsOption] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setBuckets(value: BucketsOption): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    }
  }
  
  // for redis backend
  type RedisBackend = Backend[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
  ]
  
  @js.native
  trait RedisBackendStatic
    extends StObject
       with Instantiable1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ /* redis */ Any, 
          RedisBackend
        ]
       with Instantiable2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ /* redis */ Any, 
          /* prefix */ String, 
          RedisBackend
        ]
  
  type Value = String | Double
  
  type Values = Value | js.Array[Value]
  
  type _To = js.Object & AclStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AclStatic = ^
  
  type strings = String | js.Array[String]
}
