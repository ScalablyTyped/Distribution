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
  val dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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

object Metadata {
  @scala.inline
  def apply(
    author: AuthorMetadata = null,
    build: appDashBuilderDashLibLib.outConfigurationMod.Configuration = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    description: java.lang.String = null,
    homepage: java.lang.String = null,
    license: java.lang.String = null,
    main: java.lang.String = null,
    name: java.lang.String = null,
    productName: java.lang.String = null,
    repository: java.lang.String | RepositoryInfo = null,
    version: java.lang.String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (build != null) __obj.updateDynamic("build")(build)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (license != null) __obj.updateDynamic("license")(license)
    if (main != null) __obj.updateDynamic("main")(main)
    if (name != null) __obj.updateDynamic("name")(name)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Metadata]
  }
}

