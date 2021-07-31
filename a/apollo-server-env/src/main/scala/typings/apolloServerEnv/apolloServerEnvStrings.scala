package typings.apolloServerEnv

import typings.apolloServerEnv.fetchMod.ReferrerPolicy
import typings.apolloServerEnv.fetchMod.RequestCache
import typings.apolloServerEnv.fetchMod.RequestCredentials
import typings.apolloServerEnv.fetchMod.RequestMode
import typings.apolloServerEnv.fetchMod.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apolloServerEnvStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with RequestCache
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait _empty
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait cors
    extends StObject
       with RequestMode
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait error
    extends StObject
       with RequestRedirect
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait follow
    extends StObject
       with RequestRedirect
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait `force-cache`
    extends StObject
       with RequestCache
  @scala.inline
  def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  
  @js.native
  sealed trait include
    extends StObject
       with RequestCredentials
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait manual
    extends StObject
       with RequestRedirect
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait navigate
    extends StObject
       with RequestMode
  @scala.inline
  def navigate: navigate = "navigate".asInstanceOf[navigate]
  
  @js.native
  sealed trait `no-cache`
    extends StObject
       with RequestCache
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  
  @js.native
  sealed trait `no-cors`
    extends StObject
       with RequestMode
  @scala.inline
  def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait `no-store`
    extends StObject
       with RequestCache
  @scala.inline
  def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  
  @js.native
  sealed trait omit
    extends StObject
       with RequestCredentials
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait `only-if-cached`
    extends StObject
       with RequestCache
  @scala.inline
  def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  
  @js.native
  sealed trait origin
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait reload
    extends StObject
       with RequestCache
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with ReferrerPolicy
       with RequestCredentials
       with RequestMode
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with ReferrerPolicy
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
}
