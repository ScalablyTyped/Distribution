package typings
package appDashBuilderDashLibLib.outOptionsMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Metadata extends js.Object {
  val author: js.UndefOr[AuthorMetadata | scala.Null] = js.undefined
  /**
       * The electron-builder configuration.
       */
  val build: js.UndefOr[appDashBuilderDashLibLib.outConfigurationMod.Configuration] = js.undefined
  /** @private */
  val dependencies: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * The application description.
       */
  val description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The url to the project [homepage](https://docs.npmjs.com/files/package.json#homepage) (NuGet Package `projectUrl` (optional) or Linux Package URL (required)).
       *
       * If not specified and your project repository is public on GitHub, it will be `https://github.com/${user}/${project}` by default.
       */
  val homepage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * *linux-only.* The [license](https://docs.npmjs.com/files/package.json#license) name.
       */
  val license: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** @private */
  val main: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The application name.
       * @required
       */
  val name: js.UndefOr[java.lang.String] = js.undefined
  /** @private */
  val productName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The [repository](https://docs.npmjs.com/files/package.json#repository).
       */
  val repository: js.UndefOr[java.lang.String | RepositoryInfo | scala.Null] = js.undefined
  /** @private */
  val version: js.UndefOr[java.lang.String] = js.undefined
}

