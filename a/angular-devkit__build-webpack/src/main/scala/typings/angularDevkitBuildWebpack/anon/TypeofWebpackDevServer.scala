package typings.angularDevkitBuildWebpack.anon

import org.scalablytyped.runtime.Instantiable0
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.v4
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.v6
import typings.webpackDevServer.mod.DEFAULT_STATS
import typings.webpackDevServer.mod.Host
import typings.webpackDevServer.mod.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWebpackDevServer extends StObject {
  
  var DEFAULT_STATS: Instantiable0[typings.webpackDevServer.mod.DEFAULT_STATS]
  
  /**
    * @returns {string}
    */
  /* static member */
  def findCacheDir(): String
  
  /**
    * @param {string} gateway
    * @returns {string | undefined}
    */
  /* static member */
  def findIp(gateway: String): js.UndefOr[String]
  
  /**
    * @param {Port} port
    * @param {string} host
    * @returns {Promise<number | string>}
    */
  /* static member */
  def getFreePort(port: Port, host: String): js.Promise[Double | String]
  
  /**
    * @param {Host} hostname
    * @returns {Promise<string>}
    */
  /* static member */
  def getHostname(hostname: Host): js.Promise[String]
  
  /**
    * @param {"v4" | "v6"} family
    * @returns {Promise<string | undefined>}
    */
  /* static member */
  def internalIP(family: v4 | v6): js.Promise[js.UndefOr[String]]
  
  /**
    * @param {"v4" | "v6"} family
    * @returns {string | undefined}
    */
  /* static member */
  def internalIPSync(family: v4 | v6): js.UndefOr[String]
  
  /**
    * @param {string} URL
    * @returns {boolean}
    */
  /* static member */
  def isAbsoluteURL(URL: String): Boolean
}
object TypeofWebpackDevServer {
  
  inline def apply(
    DEFAULT_STATS: Instantiable0[DEFAULT_STATS],
    findCacheDir: () => String,
    findIp: String => js.UndefOr[String],
    getFreePort: (Port, String) => js.Promise[Double | String],
    getHostname: Host => js.Promise[String],
    internalIP: v4 | v6 => js.Promise[js.UndefOr[String]],
    internalIPSync: v4 | v6 => js.UndefOr[String],
    isAbsoluteURL: String => Boolean
  ): TypeofWebpackDevServer = {
    val __obj = js.Dynamic.literal(DEFAULT_STATS = DEFAULT_STATS.asInstanceOf[js.Any], findCacheDir = js.Any.fromFunction0(findCacheDir), findIp = js.Any.fromFunction1(findIp), getFreePort = js.Any.fromFunction2(getFreePort), getHostname = js.Any.fromFunction1(getHostname), internalIP = js.Any.fromFunction1(internalIP), internalIPSync = js.Any.fromFunction1(internalIPSync), isAbsoluteURL = js.Any.fromFunction1(isAbsoluteURL))
    __obj.asInstanceOf[TypeofWebpackDevServer]
  }
  
  extension [Self <: TypeofWebpackDevServer](x: Self) {
    
    inline def setDEFAULT_STATS(value: Instantiable0[DEFAULT_STATS]): Self = StObject.set(x, "DEFAULT_STATS", value.asInstanceOf[js.Any])
    
    inline def setFindCacheDir(value: () => String): Self = StObject.set(x, "findCacheDir", js.Any.fromFunction0(value))
    
    inline def setFindIp(value: String => js.UndefOr[String]): Self = StObject.set(x, "findIp", js.Any.fromFunction1(value))
    
    inline def setGetFreePort(value: (Port, String) => js.Promise[Double | String]): Self = StObject.set(x, "getFreePort", js.Any.fromFunction2(value))
    
    inline def setGetHostname(value: Host => js.Promise[String]): Self = StObject.set(x, "getHostname", js.Any.fromFunction1(value))
    
    inline def setInternalIP(value: v4 | v6 => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "internalIP", js.Any.fromFunction1(value))
    
    inline def setInternalIPSync(value: v4 | v6 => js.UndefOr[String]): Self = StObject.set(x, "internalIPSync", js.Any.fromFunction1(value))
    
    inline def setIsAbsoluteURL(value: String => Boolean): Self = StObject.set(x, "isAbsoluteURL", js.Any.fromFunction1(value))
  }
}
