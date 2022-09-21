package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  *
  * A service that applications can use to interact with a browser's URL.
  *
  * Depending on the `LocationStrategy` used, `Location` persists
  * to the URL's path or the URL's hash segment.
  *
  * @usageNotes
  *
  * It's better to use the `Router.navigate()` service to trigger route changes. Use
  * `Location` only if you need to interact with or create normalized URLs outside of
  * routing.
  *
  * `Location` is responsible for normalizing the URL against the application's base href.
  * A normalized URL is absolute from the URL host, includes the application's base href, and has no
  * trailing slash:
  * - `/my/app/user/123` is normalized
  * - `my/app/user/123` **is not** normalized
  * - `/my/app/user/123/` **is not** normalized
  *
  * ### Example
  *
  * <code-example path='common/location/ts/path_location_component.ts'
  * region='LocationComponent'></code-example>
  *
  * @publicApi
  */
@JSImport("@angular/common", "Location")
@js.native
open class Location protected ()
  extends StObject
     with Location2 {
  def this(locationStrategy: LocationStrategy) = this()
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}
object Location {
  
  @JSImport("@angular/common", "Location")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Joins two parts of a URL with a slash if needed.
    *
    * @param start  URL string
    * @param end    URL string
    *
    *
    * @returns The joined URL string.
    */
  /* static member */
  @JSImport("@angular/common", "Location.joinWithSlash")
  @js.native
  def joinWithSlash: js.Function2[/* start */ String, /* end */ String, String] = js.native
  inline def joinWithSlash_=(x: js.Function2[/* start */ String, /* end */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("joinWithSlash")(x.asInstanceOf[js.Any])
  
  /**
    * Normalizes URL parameters by prepending with `?` if needed.
    *
    * @param  params String of URL parameters.
    *
    * @returns The normalized URL parameters string.
    */
  /* static member */
  @JSImport("@angular/common", "Location.normalizeQueryParams")
  @js.native
  def normalizeQueryParams: js.Function1[/* params */ String, String] = js.native
  inline def normalizeQueryParams_=(x: js.Function1[/* params */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizeQueryParams")(x.asInstanceOf[js.Any])
  
  /**
    * Removes a trailing slash from a URL string if needed.
    * Looks for the first occurrence of either `#`, `?`, or the end of the
    * line as `/` characters and removes the trailing slash if one exists.
    *
    * @param url URL string.
    *
    * @returns The URL string, modified if needed.
    */
  /* static member */
  @JSImport("@angular/common", "Location.stripTrailingSlash")
  @js.native
  def stripTrailingSlash: js.Function1[/* url */ String, String] = js.native
  inline def stripTrailingSlash_=(x: js.Function1[/* url */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlash")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@angular/common", "Location.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Location2, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Location2, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@angular/common", "Location.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Location2] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Location2]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
