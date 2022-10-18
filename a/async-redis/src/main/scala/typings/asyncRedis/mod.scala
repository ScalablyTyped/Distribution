package typings.asyncRedis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.asyncRedis.asyncRedisStrings.AFTER
import typings.asyncRedis.asyncRedisStrings.ASYNC
import typings.asyncRedis.asyncRedisStrings.BEFORE
import typings.asyncRedis.asyncRedisStrings.OK
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AsyncRedisClient {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any) = this()
    def this(port: Double) = this()
    def this(unix_socket: String) = this()
    def this(port: Double, host: String) = this()
    def this(
      unix_socket: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ) = this()
    def this(
      port: Double,
      host: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ) = this()
    def this(
      port: Double,
      host: Unit,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ) = this()
  }
  @JSImport("async-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AsyncRedisConstructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient * / any, 'client' | 'CLIENT' | 'hmset' | 'HMSET' | 'subscribe' | 'SUBSCRIBE' | 'unsubscribe' | 'UNSUBSCRIBE' | 'psubscribe' | 'PSUBSCRIBE' | 'punsubscribe' | 'PUNSUBSCRIBE' | 'bitfield' | 'BITFIELD' | 'blpop' | 'BLPOP' | 'brpop' | 'BRPOP' | 'cluster' | 'CLUSTER' | 'config' | 'CONFIG' | 'debug' | 'DEBUG' | 'del' | 'DEL' | 'eval' | 'EVAL' | 'evalsha' | 'EVALSHA' | 'exists' | 'EXISTS' | 'geoadd' | 'GEOADD' | 'geohash' | 'GEOHASH' | 'geopos' | 'GEOPOS' | 'geodist' | 'GEODIST' | 'georadius' | 'GEORADIUS' | 'georadiusbymember' | 'GEORADIUSBYMEMBER' | 'hdel' | 'HDEL' | 'hmget' | 'HMGET' | 'hset' | 'HSET' | 'lpush' | 'LPUSH' | 'mget' | 'MGET' | 'migrate' | 'MIGRATE' | 'mset' | 'MSET' | 'msetnx' | 'MSETNX' | 'object' | 'OBJECT' | 'pfadd' | 'PFADD' | 'pfcount' | 'PFCOUNT' | 'pfmerge' | 'PFMERGE' | 'pubsub' | 'PUBSUB' | 'rpush' | 'RPUSH' | 'sadd' | 'SADD' | 'script' | 'SCRIPT' | 'sdiff' | 'SDIFF' | 'sdiffstore' | 'SDIFFSTORE' | 'shutdown' | 'SHUTDOWN' | 'sinter' | 'SINTER' | 'sinterstore' | 'SINTERSTORE' | 'slowlog' | 'SLOWLOG' | 'sort' | 'SORT' | 'srem' | 'SREM' | 'sunion' | 'SUNION' | 'sunionstore' | 'SUNIONSTORE' | 'unlink' | 'UNLINK' | 'watch' | 'WATCH' | 'zadd' | 'ZADD' | 'zinterstore' | 'ZINTERSTORE' | 'zrem' | 'ZREM' | 'zunionstore' | 'ZUNIONSTORE' | 'scan' | 'SCAN' | 'sscan' | 'SSCAN' | 'hscan' | 'HSCAN' | 'zscan' | 'ZSCAN'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient * / any[P]} */ @js.native
  trait AsyncRedisClient
    extends StObject
       with Commands
  
  @js.native
  trait AsyncRedisConstructor
    extends StObject
       with Instantiable0[AsyncRedisClient]
       with Instantiable1[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ /* options */ Any) | (/* port */ Double) | (/* unix_socket */ String), 
          AsyncRedisClient
        ]
       with Instantiable2[
          (/* port */ Double) | (/* unix_socket */ String), 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ /* options */ Any) | (/* host */ String), 
          AsyncRedisClient
        ]
       with Instantiable3[
          /* port */ Double, 
          (/* host */ String) | (/* host */ Unit), 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ /* options */ Any, 
          AsyncRedisClient
        ] {
    
    def createClient(): AsyncRedisClient = js.native
    def createClient(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ): AsyncRedisClient = js.native
    def createClient(port: Double): AsyncRedisClient = js.native
    def createClient(port: Double, host: String): AsyncRedisClient = js.native
    def createClient(
      port: Double,
      host: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ): AsyncRedisClient = js.native
    def createClient(
      port: Double,
      host: Unit,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ): AsyncRedisClient = js.native
    def createClient(unix_socket: String): AsyncRedisClient = js.native
    def createClient(
      unix_socket: String,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
    ): AsyncRedisClient = js.native
    
    def decorate(
      client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any
    ): AsyncRedisClient = js.native
  }
  
  @js.native
  trait Commands extends StObject {
    
    def APPEND(key: String, value: String): js.Promise[Double] = js.native
    
    def AUTH(password: String): js.Promise[String] = js.native
    
    def BGREWRITEAOF(): js.Promise[OK] = js.native
    
    def BGSAVE(): js.Promise[String] = js.native
    
    def BITCOUNT(key: String): js.Promise[Double] = js.native
    def BITCOUNT(key: String, start: Double, end: Double): js.Promise[Double] = js.native
    
    def BITFIELD(args: (String | Double)*): js.Promise[js.Tuple2[Double, Double]] = js.native
    @JSName("BITFIELD")
    var BITFIELD_Original: OverloadedKeyCommand[String | Double, js.Tuple2[Double, Double]] = js.native
    
    def BITOP(operation: String, destkey: String, args: String*): js.Promise[Double] = js.native
    
    def BITPOS(key: String, bit: Double): js.Promise[Double] = js.native
    def BITPOS(key: String, bit: Double, start: Double): js.Promise[Double] = js.native
    def BITPOS(key: String, bit: Double, start: Double, end: Double): js.Promise[Double] = js.native
    def BITPOS(key: String, bit: Double, start: Unit, end: Double): js.Promise[Double] = js.native
    
    def BLPOP(args: (String | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
    @JSName("BLPOP")
    var BLPOP_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String]] = js.native
    
    def BRPOP(args: (String | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
    
    def BRPOPLPUSH(source: String, destination: String, timeout: Double): js.Promise[String | Null] = js.native
    
    @JSName("BRPOP")
    var BRPOP_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String]] = js.native
    
    def CLIENT(args: String*): js.Promise[Any] = js.native
    @JSName("CLIENT")
    var CLIENT_Original: OverloadedCommand[String, Any] = js.native
    
    def CLUSTER(args: String*): js.Promise[Any] = js.native
    @JSName("CLUSTER")
    var CLUSTER_Original: OverloadedCommand[String, Any] = js.native
    
    def COMMAND(): js.Array[js.Tuple6[String, Double, js.Array[String], Double, Double, Double]] = js.native
    
    def CONFIG(args: String*): js.Promise[Boolean] = js.native
    @JSName("CONFIG")
    var CONFIG_Original: OverloadedCommand[String, Boolean] = js.native
    
    def DBSIZE(): js.Promise[Double] = js.native
    
    def DEBUG(args: String*): js.Promise[Boolean] = js.native
    @JSName("DEBUG")
    var DEBUG_Original: OverloadedCommand[String, Boolean] = js.native
    
    def DECR(key: String): js.Promise[Double] = js.native
    
    def DECRBY(key: String, decrement: Double): js.Promise[Double] = js.native
    
    def DEL(args: String*): js.Promise[Double] = js.native
    @JSName("DEL")
    var DEL_Original: OverloadedCommand[String, Double] = js.native
    
    def DISCARD(): js.Promise[OK] = js.native
    
    def DUMP(key: String): js.Promise[String] = js.native
    
    def ECHO[T /* <: String */](message: T): js.Promise[T] = js.native
    
    def EVAL(args: (String | Double)*): js.Promise[Any] = js.native
    
    def EVALSHA(args: (String | Double)*): js.Promise[Any] = js.native
    @JSName("EVALSHA")
    var EVALSHA_Original: OverloadedCommand[String | Double, Any] = js.native
    
    @JSName("EVAL")
    var EVAL_Original: OverloadedCommand[String | Double, Any] = js.native
    
    def EXISTS(args: String*): js.Promise[Double] = js.native
    @JSName("EXISTS")
    var EXISTS_Original: OverloadedCommand[String, Double] = js.native
    
    def EXPIRE(key: String, seconds: Double): js.Promise[Double] = js.native
    
    def EXPIREAT(key: String, timestamp: Double): js.Promise[Double] = js.native
    
    def FLUSHALL(): js.Promise[String] = js.native
    @JSName("FLUSHALL")
    def FLUSHALL_ASYNC(async: ASYNC): js.Promise[String] = js.native
    
    def FLUSHDB(): js.Promise[OK] = js.native
    @JSName("FLUSHDB")
    def FLUSHDB_ASYNC(async: ASYNC): js.Promise[String] = js.native
    
    def GEOADD(args: (String | Double)*): js.Promise[Double] = js.native
    @JSName("GEOADD")
    var GEOADD_Original: OverloadedKeyCommand[String | Double, Double] = js.native
    
    def GEODIST(args: String*): js.Promise[String] = js.native
    @JSName("GEODIST")
    var GEODIST_Original: OverloadedKeyCommand[String, String] = js.native
    
    def GEOHASH(args: String*): js.Promise[String] = js.native
    @JSName("GEOHASH")
    var GEOHASH_Original: OverloadedKeyCommand[String, String] = js.native
    
    def GEOPOS(args: String*): js.Promise[js.Array[js.Tuple2[Double, Double]]] = js.native
    @JSName("GEOPOS")
    var GEOPOS_Original: OverloadedKeyCommand[String, js.Array[js.Tuple2[Double, Double]]] = js.native
    
    def GEORADIUS(args: (String | Double)*): js.Promise[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]] = js.native
    
    def GEORADIUSBYMEMBER(args: (String | Double)*): js.Promise[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]] = js.native
    @JSName("GEORADIUSBYMEMBER")
    var GEORADIUSBYMEMBER_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]
      ] = js.native
    
    @JSName("GEORADIUS")
    var GEORADIUS_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]
      ] = js.native
    
    def GET(key: String): js.Promise[String | Null] = js.native
    
    def GETBIT(key: String, offset: Double): js.Promise[Double] = js.native
    
    def GETRANGE(key: String, start: Double, end: Double): js.Promise[String] = js.native
    
    def GETSET(key: String, value: String): js.Promise[String] = js.native
    
    def HDEL(args: String*): js.Promise[Double] = js.native
    @JSName("HDEL")
    var HDEL_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def HEXISTS(key: String, field: String): js.Promise[Double] = js.native
    
    def HGET(key: String, field: String): js.Promise[String] = js.native
    
    def HGETALL(key: String): js.Promise[StringDictionary[String]] = js.native
    
    def HINCRBY(key: String, field: String, increment: Double): js.Promise[Double] = js.native
    
    def HINCRBYFLOAT(key: String, field: String, increment: Double): js.Promise[String] = js.native
    
    def HKEYS(key: String): js.Promise[js.Array[String]] = js.native
    
    def HLEN(key: String): js.Promise[Double] = js.native
    
    def HMGET(args: String*): js.Promise[js.Array[String]] = js.native
    @JSName("HMGET")
    var HMGET_Original: OverloadedKeyCommand[String, js.Array[String]] = js.native
    
    def HMSET(args: Array[String | Double]): js.Promise[OK] = js.native
    @JSName("HMSET")
    var HMSET_Original: OverloadedSetCommand[String | Double, OK] = js.native
    
    def HSCAN(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    @JSName("HSCAN")
    var HSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    def HSET(args: Array[String]): js.Promise[Double] = js.native
    
    def HSETNX(key: String, field: String, value: String): js.Promise[Double] = js.native
    
    @JSName("HSET")
    var HSET_Original: OverloadedSetCommand[String, Double] = js.native
    
    def HSTRLEN(key: String, field: String): js.Promise[Double] = js.native
    
    def HVALS(key: String): js.Promise[js.Array[String]] = js.native
    
    def INCR(key: String): js.Promise[Double] = js.native
    
    def INCRBY(key: String, increment: Double): js.Promise[Double] = js.native
    
    def INCRBYFLOAT(key: String, increment: Double): js.Promise[String] = js.native
    
    def INFO(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    def INFO(section: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    def INFO(section: js.Array[String]): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    
    def KEYS(pattern: String): js.Promise[js.Array[String]] = js.native
    
    def LASTSAVE(): js.Promise[Double] = js.native
    
    def LINDEX(key: String, index: Double): js.Promise[String] = js.native
    
    def LINSERT(key: String, dir: BEFORE | AFTER, pivot: String, value: String): js.Promise[String] = js.native
    
    def LLEN(key: String): js.Promise[Double] = js.native
    
    def LPOP(key: String): js.Promise[String] = js.native
    
    def LPUSH(args: String*): js.Promise[Double] = js.native
    
    def LPUSHX(key: String, value: String): js.Promise[Double] = js.native
    
    @JSName("LPUSH")
    var LPUSH_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def LRANGE(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    
    def LREM(key: String, count: Double, value: String): js.Promise[Double] = js.native
    
    def LSET(key: String, index: Double, value: String): js.Promise[OK] = js.native
    
    def LTRIM(key: String, start: Double, stop: Double): js.Promise[OK] = js.native
    
    def MGET(args: String*): js.Promise[js.Array[String]] = js.native
    @JSName("MGET")
    var MGET_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    def MIGRATE(args: String*): js.Promise[Boolean] = js.native
    @JSName("MIGRATE")
    var MIGRATE_Original: OverloadedCommand[String, Boolean] = js.native
    
    def MONITOR(): js.Promise[Unit] = js.native
    
    def MOVE(key: String, db: String): js.Promise[Unit] = js.native
    def MOVE(key: String, db: Double): js.Promise[Unit] = js.native
    
    def MSET(args: String*): js.Promise[Boolean] = js.native
    
    def MSETNX(args: String*): js.Promise[Boolean] = js.native
    @JSName("MSETNX")
    var MSETNX_Original: OverloadedCommand[String, Boolean] = js.native
    
    @JSName("MSET")
    var MSET_Original: OverloadedCommand[String, Boolean] = js.native
    
    def OBJECT(args: String*): js.Promise[Any] = js.native
    @JSName("OBJECT")
    var OBJECT_Original: OverloadedCommand[String, Any] = js.native
    
    def PERSIST(key: String): js.Promise[Double] = js.native
    
    def PEXPIRE(key: String, milliseconds: Double): js.Promise[Double] = js.native
    
    def PEXPIREAT(key: String, millisecondsTimestamp: Double): js.Promise[Double] = js.native
    
    def PFADD(args: String*): js.Promise[Double] = js.native
    @JSName("PFADD")
    var PFADD_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def PFCOUNT(args: String*): js.Promise[Double] = js.native
    @JSName("PFCOUNT")
    var PFCOUNT_Original: OverloadedCommand[String, Double] = js.native
    
    def PFMERGE(args: String*): js.Promise[Boolean] = js.native
    @JSName("PFMERGE")
    var PFMERGE_Original: OverloadedCommand[String, Boolean] = js.native
    
    def PING(): js.Promise[String] = js.native
    def PING(message: String): js.Promise[String] = js.native
    
    def PSETEX(key: String, milliseconds: Double, value: String): js.Promise[OK] = js.native
    
    def PSUBSCRIBE(args: String*): js.Promise[String] = js.native
    @JSName("PSUBSCRIBE")
    var PSUBSCRIBE_Original: OverloadedListCommand[String, String] = js.native
    
    def PTTL(key: String): js.Promise[Double] = js.native
    
    def PUBLISH(channel: String, value: String): js.Promise[Double] = js.native
    
    def PUBSUB(args: String*): js.Promise[Double] = js.native
    @JSName("PUBSUB")
    var PUBSUB_Original: OverloadedCommand[String, Double] = js.native
    
    def PUNSUBSCRIBE(args: String*): js.Promise[String] = js.native
    @JSName("PUNSUBSCRIBE")
    var PUNSUBSCRIBE_Original: OverloadedListCommand[String, String] = js.native
    
    def QUIT(): js.Promise[OK] = js.native
    
    def RANDOMKEY(): js.Promise[String] = js.native
    
    def READONLY(): js.Promise[String] = js.native
    
    def READWRITE(): js.Promise[String] = js.native
    
    def RENAME(key: String, newkey: String): js.Promise[OK] = js.native
    
    def RENAMENX(key: String, newkey: String): js.Promise[Double] = js.native
    
    def RESTORE(key: String, ttl: Double, serializedValue: String): js.Promise[OK] = js.native
    
    def ROLE(): js.Promise[js.Tuple3[String, Double, js.Array[js.Tuple3[String, String, String]]]] = js.native
    
    def RPOP(key: String): js.Promise[String] = js.native
    
    def RPOPLPUSH(source: String, destination: String): js.Promise[String] = js.native
    
    def RPUSH(args: String*): js.Promise[Double] = js.native
    
    def RPUSHX(key: String, value: String): js.Promise[Double] = js.native
    
    @JSName("RPUSH")
    var RPUSH_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def SADD(args: String*): js.Promise[Double] = js.native
    @JSName("SADD")
    var SADD_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def SAVE(): js.Promise[String] = js.native
    
    def SCAN(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    @JSName("SCAN")
    var SCAN_Original: OverloadedCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    def SCARD(key: String): js.Promise[Double] = js.native
    
    def SCRIPT(args: String*): js.Promise[Any] = js.native
    @JSName("SCRIPT")
    var SCRIPT_Original: OverloadedCommand[String, Any] = js.native
    
    def SDIFF(args: String*): js.Promise[js.Array[String]] = js.native
    
    def SDIFFSTORE(args: String*): js.Promise[Double] = js.native
    @JSName("SDIFFSTORE")
    var SDIFFSTORE_Original: OverloadedKeyCommand[String, Double] = js.native
    
    @JSName("SDIFF")
    var SDIFF_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    def SELECT(index: String): js.Promise[String] = js.native
    def SELECT(index: Double): js.Promise[String] = js.native
    
    def SET(key: String, value: String): js.Promise[OK] = js.native
    def SET(key: String, value: String, flag: String): js.Promise[OK] = js.native
    def SET(key: String, value: String, flag: String, mode: String, duration: Double): js.Promise[js.UndefOr[OK]] = js.native
    def SET(key: String, value: String, mode: String, duration: Double): js.Promise[js.UndefOr[OK]] = js.native
    def SET(key: String, value: String, mode: String, duration: Double, flag: String): js.Promise[js.UndefOr[OK]] = js.native
    
    def SETBIT(key: String, offset: Double, value: String): js.Promise[Double] = js.native
    
    def SETEX(key: String, seconds: Double, value: String): js.Promise[String] = js.native
    
    def SETNX(key: String, value: String): js.Promise[Double] = js.native
    
    def SETRANGE(key: String, offset: Double, value: String): js.Promise[Double] = js.native
    
    def SHUTDOWN(args: String*): js.Promise[String] = js.native
    @JSName("SHUTDOWN")
    var SHUTDOWN_Original: OverloadedCommand[String, String] = js.native
    
    def SINTER(args: String*): js.Promise[js.Array[String]] = js.native
    
    def SINTERSTORE(args: String*): js.Promise[Double] = js.native
    @JSName("SINTERSTORE")
    var SINTERSTORE_Original: OverloadedCommand[String, Double] = js.native
    
    @JSName("SINTER")
    var SINTER_Original: OverloadedKeyCommand[String, js.Array[String]] = js.native
    
    def SISMEMBER(key: String, member: String): js.Promise[Double] = js.native
    
    def SLAVEOF(host: String, port: String): js.Promise[String] = js.native
    def SLAVEOF(host: String, port: Double): js.Promise[String] = js.native
    
    def SLOWLOG(args: String*): js.Promise[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]] = js.native
    @JSName("SLOWLOG")
    var SLOWLOG_Original: OverloadedCommand[String, js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]] = js.native
    
    def SMEMBERS(key: String): js.Promise[js.Array[String]] = js.native
    
    def SMOVE(source: String, destination: String, member: String): js.Promise[Double] = js.native
    
    def SORT(args: String*): js.Promise[js.Array[String]] = js.native
    @JSName("SORT")
    var SORT_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    def SPOP(key: String): js.Promise[String] = js.native
    def SPOP(key: String, count: Double): js.Promise[js.Array[String]] = js.native
    
    def SRANDMEMBER(key: String): js.Promise[String] = js.native
    def SRANDMEMBER(key: String, count: Double): js.Promise[js.Array[String]] = js.native
    
    def SREM(args: String*): js.Promise[Double] = js.native
    @JSName("SREM")
    var SREM_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def SSCAN(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    @JSName("SSCAN")
    var SSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    def STRLEN(key: String): js.Promise[Double] = js.native
    
    def SUBSCRIBE(args: String*): js.Promise[String] = js.native
    @JSName("SUBSCRIBE")
    var SUBSCRIBE_Original: OverloadedListCommand[String, String] = js.native
    
    def SUNION(args: String*): js.Promise[js.Array[String]] = js.native
    
    def SUNIONSTORE(args: String*): js.Promise[Double] = js.native
    @JSName("SUNIONSTORE")
    var SUNIONSTORE_Original: OverloadedCommand[String, Double] = js.native
    
    @JSName("SUNION")
    var SUNION_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    def SYNC(): js.Promise[Unit] = js.native
    
    def TIME(): js.Promise[js.Tuple2[String, String]] = js.native
    
    def TTL(key: String): js.Promise[Double] = js.native
    
    def TYPE(key: String): js.Promise[String] = js.native
    
    def UNLINK(args: String*): js.Promise[Double] = js.native
    @JSName("UNLINK")
    var UNLINK_Original: OverloadedCommand[String, Double] = js.native
    
    def UNSUBSCRIBE(args: String*): js.Promise[String] = js.native
    @JSName("UNSUBSCRIBE")
    var UNSUBSCRIBE_Original: OverloadedListCommand[String, String] = js.native
    
    def UNWATCH(): js.Promise[OK] = js.native
    
    def WAIT(numslaves: Double, timeout: Double): js.Promise[Double] = js.native
    
    def WATCH(args: String*): js.Promise[OK] = js.native
    @JSName("WATCH")
    var WATCH_Original: OverloadedCommand[String, OK] = js.native
    
    def ZADD(args: (String | Double)*): js.Promise[Double] = js.native
    @JSName("ZADD")
    var ZADD_Original: OverloadedKeyCommand[String | Double, Double] = js.native
    
    def ZCARD(key: String): js.Promise[Double] = js.native
    
    def ZCOUNT(key: String, min: String, max: String): js.Promise[Double] = js.native
    def ZCOUNT(key: String, min: String, max: Double): js.Promise[Double] = js.native
    def ZCOUNT(key: String, min: Double, max: String): js.Promise[Double] = js.native
    def ZCOUNT(key: String, min: Double, max: Double): js.Promise[Double] = js.native
    
    def ZINCRBY(key: String, increment: Double, member: String): js.Promise[String] = js.native
    
    def ZINTERSTORE(args: (String | Double)*): js.Promise[Double] = js.native
    @JSName("ZINTERSTORE")
    var ZINTERSTORE_Original: OverloadedCommand[String | Double, Double] = js.native
    
    def ZLEXCOUNT(key: String, min: String, max: String): js.Promise[Double] = js.native
    
    def ZRANGE(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGE(key: String, start: Double, stop: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    
    def ZRANGEBYLEX(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYLEX(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    
    def ZRANGEBYSCORE(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    
    def ZRANK(key: String, member: String): js.Promise[Double | Null] = js.native
    
    def ZREM(args: String*): js.Promise[Double] = js.native
    
    def ZREMRANGEBYLEX(key: String, min: String, max: String): js.Promise[Double] = js.native
    
    def ZREMRANGEBYRANK(key: String, start: Double, stop: Double): js.Promise[Double] = js.native
    
    def ZREMRANGEBYSCORE(key: String, min: String, max: String): js.Promise[Double] = js.native
    def ZREMRANGEBYSCORE(key: String, min: String, max: Double): js.Promise[Double] = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: String): js.Promise[Double] = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: Double): js.Promise[Double] = js.native
    
    @JSName("ZREM")
    var ZREM_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def ZREVRANGE(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGE(key: String, start: Double, stop: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    
    def ZREVRANGEBYLEX(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYLEX(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    
    def ZREVRANGEBYSCORE(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    
    def ZREVRANK(key: String, member: String): js.Promise[Double | Null] = js.native
    
    def ZSCAN(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    @JSName("ZSCAN")
    var ZSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    def ZSCORE(key: String, member: String): js.Promise[String] = js.native
    
    def ZUNIONSTORE(args: (String | Double)*): js.Promise[Double] = js.native
    @JSName("ZUNIONSTORE")
    var ZUNIONSTORE_Original: OverloadedCommand[String | Double, Double] = js.native
    
    /**
      * Append a value to a key.
      */
    def append(key: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Authenticate to the server.
      */
    def auth(password: String): js.Promise[String] = js.native
    
    /**
      * Asynchronously rewrite the append-only file.
      */
    def bgrewriteaof(): js.Promise[OK] = js.native
    
    /**
      * Asynchronously save the dataset to disk.
      */
    def bgsave(): js.Promise[String] = js.native
    
    /**
      * Count set bits in a string.
      */
    def bitcount(key: String): js.Promise[Double] = js.native
    def bitcount(key: String, start: Double, end: Double): js.Promise[Double] = js.native
    
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(args: (String | Double)*): js.Promise[js.Tuple2[Double, Double]] = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    @JSName("bitfield")
    var bitfield_Original: OverloadedKeyCommand[String | Double, js.Tuple2[Double, Double]] = js.native
    
    /**
      * Perform bitwise operations between strings.
      */
    def bitop(operation: String, destkey: String, args: String*): js.Promise[Double] = js.native
    
    /**
      * Find first bit set or clear in a string.
      */
    def bitpos(key: String, bit: Double): js.Promise[Double] = js.native
    def bitpos(key: String, bit: Double, start: Double): js.Promise[Double] = js.native
    def bitpos(key: String, bit: Double, start: Double, end: Double): js.Promise[Double] = js.native
    def bitpos(key: String, bit: Double, start: Unit, end: Double): js.Promise[Double] = js.native
    
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(args: (String | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    @JSName("blpop")
    var blpop_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String]] = js.native
    
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(args: (String | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    @JSName("brpop")
    var brpop_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String]] = js.native
    
    /**
      * Pop a value from a list, push it to another list and return it; or block until one is available.
      */
    def brpoplpush(source: String, destination: String, timeout: Double): js.Promise[String | Null] = js.native
    
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(args: String*): js.Promise[Any] = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    @JSName("client")
    var client_Original: OverloadedCommand[String, Any] = js.native
    
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(args: String*): js.Promise[Any] = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    @JSName("cluster")
    var cluster_Original: OverloadedCommand[String, Any] = js.native
    
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get total number of Redis commands.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific REdis command details.
      */
    def command(): js.Array[js.Tuple6[String, Double, js.Array[String], Double, Double, Double]] = js.native
    
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(args: String*): js.Promise[Boolean] = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    @JSName("config")
    var config_Original: OverloadedCommand[String, Boolean] = js.native
    
    /**
      * Return the number of keys in the selected database.
      */
    def dbsize(): js.Promise[Double] = js.native
    
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(args: String*): js.Promise[Boolean] = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    @JSName("debug")
    var debug_Original: OverloadedCommand[String, Boolean] = js.native
    
    /**
      * Decrement the integer value of a key by one.
      */
    def decr(key: String): js.Promise[Double] = js.native
    
    /**
      * Decrement the integer value of a key by the given number.
      */
    def decrby(key: String, decrement: Double): js.Promise[Double] = js.native
    
    /**
      * Delete a key.
      */
    def del(args: String*): js.Promise[Double] = js.native
    /**
      * Delete a key.
      */
    @JSName("del")
    var del_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Discard all commands issued after MULTI.
      */
    def discard(): js.Promise[OK] = js.native
    
    /**
      * Return a serialized version of the value stored at the specified key.
      */
    def dump(key: String): js.Promise[String] = js.native
    
    /**
      * Echo the given string.
      */
    def echo[T /* <: String */](message: T): js.Promise[T] = js.native
    
    /**
      * Execute a Lua script server side.
      */
    def eval(args: (String | Double)*): js.Promise[Any] = js.native
    /**
      * Execute a Lua script server side.
      */
    @JSName("eval")
    var eval_Original: OverloadedCommand[String | Double, Any] = js.native
    
    /**
      * Execute a Lue script server side.
      */
    def evalsha(args: (String | Double)*): js.Promise[Any] = js.native
    /**
      * Execute a Lue script server side.
      */
    @JSName("evalsha")
    var evalsha_Original: OverloadedCommand[String | Double, Any] = js.native
    
    /**
      * Determine if a key exists.
      */
    def exists(args: String*): js.Promise[Double] = js.native
    /**
      * Determine if a key exists.
      */
    @JSName("exists")
    var exists_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Set a key's time to live in seconds.
      */
    def expire(key: String, seconds: Double): js.Promise[Double] = js.native
    
    /**
      * Set the expiration for a key as a UNIX timestamp.
      */
    def expireat(key: String, timestamp: Double): js.Promise[Double] = js.native
    
    /**
      * Remove all keys from all databases.
      */
    def flushall(): js.Promise[String] = js.native
    @JSName("flushall")
    def flushall_ASYNC(async: ASYNC): js.Promise[String] = js.native
    
    /**
      * Remove all keys from the current database.
      */
    def flushdb(): js.Promise[OK] = js.native
    @JSName("flushdb")
    def flushdb_ASYNC(async: ASYNC): js.Promise[String] = js.native
    
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(args: (String | Double)*): js.Promise[Double] = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    @JSName("geoadd")
    var geoadd_Original: OverloadedKeyCommand[String | Double, Double] = js.native
    
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(args: String*): js.Promise[String] = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    @JSName("geodist")
    var geodist_Original: OverloadedKeyCommand[String, String] = js.native
    
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(args: String*): js.Promise[String] = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    @JSName("geohash")
    var geohash_Original: OverloadedKeyCommand[String, String] = js.native
    
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(args: String*): js.Promise[js.Array[js.Tuple2[Double, Double]]] = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    @JSName("geopos")
    var geopos_Original: OverloadedKeyCommand[String, js.Array[js.Tuple2[Double, Double]]] = js.native
    
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(args: (String | Double)*): js.Promise[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]] = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    @JSName("georadius")
    var georadius_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]
      ] = js.native
    
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(args: (String | Double)*): js.Promise[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]] = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    @JSName("georadiusbymember")
    var georadiusbymember_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]
      ] = js.native
    
    /**
      * Get the value of a key.
      */
    def get(key: String): js.Promise[String | Null] = js.native
    
    /**
      * Returns the bit value at offset in the string value stored at key.
      */
    def getbit(key: String, offset: Double): js.Promise[Double] = js.native
    
    /**
      * Get a substring of the string stored at a key.
      */
    def getrange(key: String, start: Double, end: Double): js.Promise[String] = js.native
    
    /**
      * Set the string value of a key and return its old value.
      */
    def getset(key: String, value: String): js.Promise[String] = js.native
    
    /**
      * Delete on or more hash fields.
      */
    def hdel(args: String*): js.Promise[Double] = js.native
    /**
      * Delete on or more hash fields.
      */
    @JSName("hdel")
    var hdel_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Determine if a hash field exists.
      */
    def hexists(key: String, field: String): js.Promise[Double] = js.native
    
    /**
      * Get the value of a hash field.
      */
    def hget(key: String, field: String): js.Promise[String] = js.native
    
    /**
      * Get all fields and values in a hash.
      */
    def hgetall(key: String): js.Promise[StringDictionary[String]] = js.native
    
    /**
      * Increment the integer value of a hash field by the given number.
      */
    def hincrby(key: String, field: String, increment: Double): js.Promise[Double] = js.native
    
    /**
      * Increment the float value of a hash field by the given amount.
      */
    def hincrbyfloat(key: String, field: String, increment: Double): js.Promise[String] = js.native
    
    /**
      * Get all the fields of a hash.
      */
    def hkeys(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get the number of fields in a hash.
      */
    def hlen(key: String): js.Promise[Double] = js.native
    
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Get the values of all the given hash fields.
      */
    @JSName("hmget")
    var hmget_Original: OverloadedKeyCommand[String, js.Array[String]] = js.native
    
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(args: Array[String | Double]): js.Promise[OK] = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    @JSName("hmset")
    var hmset_Original: OverloadedSetCommand[String | Double, OK] = js.native
    
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    @JSName("hscan")
    var hscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    /**
      * Set the string value of a hash field.
      */
    def hset(args: Array[String]): js.Promise[Double] = js.native
    /**
      * Set the string value of a hash field.
      */
    @JSName("hset")
    var hset_Original: OverloadedSetCommand[String, Double] = js.native
    
    /**
      * Set the value of a hash field, only if the field does not exist.
      */
    def hsetnx(key: String, field: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Get the length of the value of a hash field.
      */
    def hstrlen(key: String, field: String): js.Promise[Double] = js.native
    
    /**
      * Get all the values of a hash.
      */
    def hvals(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Increment the integer value of a key by one.
      */
    def incr(key: String): js.Promise[Double] = js.native
    
    /**
      * Increment the integer value of a key by the given amount.
      */
    def incrby(key: String, increment: Double): js.Promise[Double] = js.native
    
    /**
      * Increment the float value of a key by the given amount.
      */
    def incrbyfloat(key: String, increment: Double): js.Promise[String] = js.native
    
    /**
      * Get information and statistics about the server.
      */
    def info(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    def info(section: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    def info(section: js.Array[String]): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerInfo */ Any
      ] = js.native
    
    /**
      * Find all keys matching the given pattern.
      */
    def keys(pattern: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get the UNIX time stamp of the last successful save to disk.
      */
    def lastsave(): js.Promise[Double] = js.native
    
    /**
      * Get an element from a list by its index.
      */
    def lindex(key: String, index: Double): js.Promise[String] = js.native
    
    /**
      * Insert an element before or after another element in a list.
      */
    def linsert(key: String, dir: BEFORE | AFTER, pivot: String, value: String): js.Promise[String] = js.native
    
    /**
      * Get the length of a list.
      */
    def llen(key: String): js.Promise[Double] = js.native
    
    /**
      * Remove and get the first element in a list.
      */
    def lpop(key: String): js.Promise[String] = js.native
    
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(args: String*): js.Promise[Double] = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    @JSName("lpush")
    var lpush_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Prepend a value to a list, only if the list exists.
      */
    def lpushx(key: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Get a range of elements from a list.
      */
    def lrange(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    
    /**
      * Remove elements from a list.
      */
    def lrem(key: String, count: Double, value: String): js.Promise[Double] = js.native
    
    /**
      * Set the value of an element in a list by its index.
      */
    def lset(key: String, index: Double, value: String): js.Promise[OK] = js.native
    
    /**
      * Trim a list to the specified range.
      */
    def ltrim(key: String, start: Double, stop: Double): js.Promise[OK] = js.native
    
    /**
      * Get the values of all given keys.
      */
    def mget(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Get the values of all given keys.
      */
    @JSName("mget")
    var mget_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(args: String*): js.Promise[Boolean] = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    @JSName("migrate")
    var migrate_Original: OverloadedCommand[String, Boolean] = js.native
    
    def monitor(): js.Promise[Unit] = js.native
    
    /**
      * Move a key to another database.
      */
    def move(key: String, db: String): js.Promise[Unit] = js.native
    def move(key: String, db: Double): js.Promise[Unit] = js.native
    
    /**
      * Set multiple keys to multiple values.
      */
    def mset(args: String*): js.Promise[Boolean] = js.native
    /**
      * Set multiple keys to multiple values.
      */
    @JSName("mset")
    var mset_Original: OverloadedCommand[String, Boolean] = js.native
    
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(args: String*): js.Promise[Boolean] = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    @JSName("msetnx")
    var msetnx_Original: OverloadedCommand[String, Boolean] = js.native
    
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(args: String*): js.Promise[Any] = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    @JSName("object")
    var object_Original: OverloadedCommand[String, Any] = js.native
    
    /**
      * Remove the expiration from a key.
      */
    def persist(key: String): js.Promise[Double] = js.native
    
    /**
      * Remove a key's time to live in milliseconds.
      */
    def pexpire(key: String, milliseconds: Double): js.Promise[Double] = js.native
    
    /**
      * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
      */
    def pexpireat(key: String, millisecondsTimestamp: Double): js.Promise[Double] = js.native
    
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(args: String*): js.Promise[Double] = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    @JSName("pfadd")
    var pfadd_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(args: String*): js.Promise[Double] = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    @JSName("pfcount")
    var pfcount_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(args: String*): js.Promise[Boolean] = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    @JSName("pfmerge")
    var pfmerge_Original: OverloadedCommand[String, Boolean] = js.native
    
    /**
      * Ping the server.
      */
    def ping(): js.Promise[String] = js.native
    def ping(message: String): js.Promise[String] = js.native
    
    /**
      * Set the value and expiration in milliseconds of a key.
      */
    def psetex(key: String, milliseconds: Double, value: String): js.Promise[OK] = js.native
    
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(args: String*): js.Promise[String] = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    @JSName("psubscribe")
    var psubscribe_Original: OverloadedListCommand[String, String] = js.native
    
    /**
      * Get the time to live for a key in milliseconds.
      */
    def pttl(key: String): js.Promise[Double] = js.native
    
    /**
      * Post a message to a channel.
      */
    def publish(channel: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(args: String*): js.Promise[Double] = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    @JSName("pubsub")
    var pubsub_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(args: String*): js.Promise[String] = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    @JSName("punsubscribe")
    var punsubscribe_Original: OverloadedListCommand[String, String] = js.native
    
    /**
      * Close the connection.
      */
    def quit(): js.Promise[OK] = js.native
    
    /**
      * Return a random key from the keyspace.
      */
    def randomkey(): js.Promise[String] = js.native
    
    /**
      * Enables read queries for a connection to a cluster slave node.
      */
    def readonly(): js.Promise[String] = js.native
    
    /**
      * Disables read queries for a connection to cluster slave node.
      */
    def readwrite(): js.Promise[String] = js.native
    
    /**
      * Rename a key.
      */
    def rename(key: String, newkey: String): js.Promise[OK] = js.native
    
    /**
      * Rename a key, only if the new key does not exist.
      */
    def renamenx(key: String, newkey: String): js.Promise[Double] = js.native
    
    /**
      * Create a key using the provided serialized value, previously obtained using DUMP.
      */
    def restore(key: String, ttl: Double, serializedValue: String): js.Promise[OK] = js.native
    
    /**
      * Return the role of the instance in the context of replication.
      */
    def role(): js.Promise[js.Tuple3[String, Double, js.Array[js.Tuple3[String, String, String]]]] = js.native
    
    /**
      * Remove and get the last element in a list.
      */
    def rpop(key: String): js.Promise[String] = js.native
    
    /**
      * Remove the last element in a list, prepend it to another list and return it.
      */
    def rpoplpush(source: String, destination: String): js.Promise[String] = js.native
    
    /**
      * Append one or multiple values to a list.
      */
    def rpush(args: String*): js.Promise[Double] = js.native
    /**
      * Append one or multiple values to a list.
      */
    @JSName("rpush")
    var rpush_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Append a value to a list, only if the list exists.
      */
    def rpushx(key: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Append one or multiple members to a set.
      */
    def sadd(args: String*): js.Promise[Double] = js.native
    /**
      * Append one or multiple members to a set.
      */
    @JSName("sadd")
    var sadd_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Synchronously save the dataset to disk.
      */
    def save(): js.Promise[String] = js.native
    
    /**
      * Incrementally iterate the keys space.
      */
    def scan(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    /**
      * Incrementally iterate the keys space.
      */
    @JSName("scan")
    var scan_Original: OverloadedCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    /**
      * Get the number of members in a set.
      */
    def scard(key: String): js.Promise[Double] = js.native
    
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(args: String*): js.Promise[Any] = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    @JSName("script")
    var script_Original: OverloadedCommand[String, Any] = js.native
    
    /**
      * Subtract multiple sets.
      */
    def sdiff(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Subtract multiple sets.
      */
    @JSName("sdiff")
    var sdiff_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(args: String*): js.Promise[Double] = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    @JSName("sdiffstore")
    var sdiffstore_Original: OverloadedKeyCommand[String, Double] = js.native
    
    def select(index: String): js.Promise[String] = js.native
    /**
      * Change the selected database for the current connection.
      */
    def select(index: Double): js.Promise[String] = js.native
    
    /**
      * Set the string value of a key.
      */
    def set(key: String, value: String): js.Promise[OK] = js.native
    def set(key: String, value: String, flag: String): js.Promise[OK] = js.native
    def set(key: String, value: String, flag: String, mode: String, duration: Double): js.Promise[js.UndefOr[OK]] = js.native
    def set(key: String, value: String, mode: String, duration: Double): js.Promise[js.UndefOr[OK]] = js.native
    def set(key: String, value: String, mode: String, duration: Double, flag: String): js.Promise[js.UndefOr[OK]] = js.native
    
    /**
      * Sets or clears the bit at offset in the string value stored at key.
      */
    def setbit(key: String, offset: Double, value: String): js.Promise[Double] = js.native
    
    /**
      * Set the value and expiration of a key.
      */
    def setex(key: String, seconds: Double, value: String): js.Promise[String] = js.native
    
    /**
      * Set the value of a key, only if the key does not exist.
      */
    def setnx(key: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Overwrite part of a string at key starting at the specified offset.
      */
    def setrange(key: String, offset: Double, value: String): js.Promise[Double] = js.native
    
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(args: String*): js.Promise[String] = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    @JSName("shutdown")
    var shutdown_Original: OverloadedCommand[String, String] = js.native
    
    /**
      * Intersect multiple sets.
      */
    def sinter(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Intersect multiple sets.
      */
    @JSName("sinter")
    var sinter_Original: OverloadedKeyCommand[String, js.Array[String]] = js.native
    
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(args: String*): js.Promise[Double] = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    @JSName("sinterstore")
    var sinterstore_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Determine if a given value is a member of a set.
      */
    def sismember(key: String, member: String): js.Promise[Double] = js.native
    
    /**
      * Make the server a slave of another instance, or promote it as master.
      */
    def slaveof(host: String, port: String): js.Promise[String] = js.native
    def slaveof(host: String, port: Double): js.Promise[String] = js.native
    
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(args: String*): js.Promise[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]] = js.native
    /**
      * Manages the Redis slow queries log.
      */
    @JSName("slowlog")
    var slowlog_Original: OverloadedCommand[String, js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]] = js.native
    
    /**
      * Get all the members in a set.
      */
    def smembers(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Move a member from one set to another.
      */
    def smove(source: String, destination: String, member: String): js.Promise[Double] = js.native
    
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    @JSName("sort")
    var sort_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    /**
      * Remove and return one or multiple random members from a set.
      */
    def spop(key: String): js.Promise[String] = js.native
    def spop(key: String, count: Double): js.Promise[js.Array[String]] = js.native
    
    /**
      * Get one or multiple random members from a set.
      */
    def srandmember(key: String): js.Promise[String] = js.native
    def srandmember(key: String, count: Double): js.Promise[js.Array[String]] = js.native
    
    /**
      * Remove one or more members from a set.
      */
    def srem(args: String*): js.Promise[Double] = js.native
    /**
      * Remove one or more members from a set.
      */
    @JSName("srem")
    var srem_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    /**
      * Incrementally iterate Set elements.
      */
    @JSName("sscan")
    var sscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    /**
      * Get the length of the value stored in a key.
      */
    def strlen(key: String): js.Promise[Double] = js.native
    
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(args: String*): js.Promise[String] = js.native
    /**
      * Listen for messages published to the given channels.
      */
    @JSName("subscribe")
    var subscribe_Original: OverloadedListCommand[String, String] = js.native
    
    /**
      * Add multiple sets.
      */
    def sunion(args: String*): js.Promise[js.Array[String]] = js.native
    /**
      * Add multiple sets.
      */
    @JSName("sunion")
    var sunion_Original: OverloadedCommand[String, js.Array[String]] = js.native
    
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(args: String*): js.Promise[Double] = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    @JSName("sunionstore")
    var sunionstore_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Internal command used for replication.
      */
    def sync(): js.Promise[Unit] = js.native
    
    /**
      * Return the current server time.
      */
    def time(): js.Promise[js.Tuple2[String, String]] = js.native
    
    /**
      * Get the time to live for a key.
      */
    def ttl(key: String): js.Promise[Double] = js.native
    
    /**
      * Determine the type stored at key.
      */
    def `type`(key: String): js.Promise[String] = js.native
    
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(args: String*): js.Promise[Double] = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    @JSName("unlink")
    var unlink_Original: OverloadedCommand[String, Double] = js.native
    
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(args: String*): js.Promise[String] = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    @JSName("unsubscribe")
    var unsubscribe_Original: OverloadedListCommand[String, String] = js.native
    
    /**
      * Forget about all watched keys.
      */
    def unwatch(): js.Promise[OK] = js.native
    
    /**
      * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
      */
    def wait(numslaves: Double, timeout: Double): js.Promise[Double] = js.native
    
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(args: String*): js.Promise[OK] = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    @JSName("watch")
    var watch_Original: OverloadedCommand[String, OK] = js.native
    
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(args: (String | Double)*): js.Promise[Double] = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    @JSName("zadd")
    var zadd_Original: OverloadedKeyCommand[String | Double, Double] = js.native
    
    /**
      * Get the number of members in a sorted set.
      */
    def zcard(key: String): js.Promise[Double] = js.native
    
    def zcount(key: String, min: String, max: String): js.Promise[Double] = js.native
    def zcount(key: String, min: String, max: Double): js.Promise[Double] = js.native
    def zcount(key: String, min: Double, max: String): js.Promise[Double] = js.native
    /**
      * Count the members in a sorted set with scores between the given values.
      */
    def zcount(key: String, min: Double, max: Double): js.Promise[Double] = js.native
    
    /**
      * Increment the score of a member in a sorted set.
      */
    def zincrby(key: String, increment: Double, member: String): js.Promise[String] = js.native
    
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(args: (String | Double)*): js.Promise[Double] = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    @JSName("zinterstore")
    var zinterstore_Original: OverloadedCommand[String | Double, Double] = js.native
    
    /**
      * Count the number of members in a sorted set between a given lexicographic range.
      */
    def zlexcount(key: String, min: String, max: String): js.Promise[Double] = js.native
    
    /**
      * Return a range of members in a sorted set, by index.
      */
    def zrange(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    def zrange(key: String, start: Double, stop: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Return a range of members in a sorted set, by lexicographical range.
      */
    def zrangebylex(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def zrangebylex(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    
    def zrangebyscore(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: String, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: String, max: String, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: String, max: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: String, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: String, max: Double, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: Double, max: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: Double, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: Double, max: String, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    /**
      * Return a range of members in a sorted set, by score.
      */
    def zrangebyscore(key: String, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: Double, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(key: String, min: Double, max: Double, withscores: String, limit: String, offset: Double): js.Promise[js.Array[String]] = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    
    /**
      * Determine the index of a member in a sorted set.
      */
    def zrank(key: String, member: String): js.Promise[Double | Null] = js.native
    
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(args: String*): js.Promise[Double] = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    @JSName("zrem")
    var zrem_Original: OverloadedKeyCommand[String, Double] = js.native
    
    /**
      * Remove all members in a sorted set between the given lexicographical range.
      */
    def zremrangebylex(key: String, min: String, max: String): js.Promise[Double] = js.native
    
    /**
      * Remove all members in a sorted set within the given indexes.
      */
    def zremrangebyrank(key: String, start: Double, stop: Double): js.Promise[Double] = js.native
    
    /**
      * Remove all members in a sorted set within the given indexes.
      */
    def zremrangebyscore(key: String, min: String, max: String): js.Promise[Double] = js.native
    def zremrangebyscore(key: String, min: String, max: Double): js.Promise[Double] = js.native
    def zremrangebyscore(key: String, min: Double, max: String): js.Promise[Double] = js.native
    def zremrangebyscore(key: String, min: Double, max: Double): js.Promise[Double] = js.native
    
    /**
      * Return a range of members in a sorted set, by index, with scores ordered from high to low.
      */
    def zrevrange(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    def zrevrange(key: String, start: Double, stop: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
      */
    def zrevrangebylex(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebylex(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    
    def zrevrangebyscore(key: String, min: String, max: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: String, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: String, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: String, max: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: Double, max: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    /**
      * Return a range of members in a sorted set, by score, with scores ordered from high to low.
      */
    def zrevrangebyscore(key: String, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, withscores: String): js.Promise[js.Array[String]] = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): js.Promise[js.Array[String]] = js.native
    
    /**
      * Determine the index of a member in a sorted set, with scores ordered from high to low.
      */
    def zrevrank(key: String, member: String): js.Promise[Double | Null] = js.native
    
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(args: String*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    @JSName("zscan")
    var zscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]]] = js.native
    
    /**
      * Get the score associated with the given member in a sorted set.
      */
    def zscore(key: String, member: String): js.Promise[String] = js.native
    
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(args: (String | Double)*): js.Promise[Double] = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    @JSName("zunionstore")
    var zunionstore_Original: OverloadedCommand[String | Double, Double] = js.native
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Omitted = Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.asyncRedis.asyncRedisStrings.client_, typings.asyncRedis.asyncRedisStrings.CLIENT, typings.asyncRedis.asyncRedisStrings.hmset_ */ Any
  ]
  
  type OverloadedCommand[T, U] = js.Function1[/* repeated */ T, js.Promise[U]]
  
  type OverloadedKeyCommand[T, U] = js.Function1[/* repeated */ String | T, js.Promise[U]]
  
  type OverloadedLastCommand[T1, T2, U] = js.Function1[/* repeated */ T1 | T2, js.Promise[U]]
  
  type OverloadedListCommand[T, U] = js.Function1[/* repeated */ T, js.Promise[U]]
  
  type OverloadedSetCommand[T, U] = js.Function1[/* args */ Array[String | T], js.Promise[U]]
  
  type _To = js.Object & AsyncRedisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AsyncRedisConstructor = ^
}
