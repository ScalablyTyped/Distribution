package typings.appDashBuilderDashLib.outOptionsMetadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  val author: js.UndefOr[AuthorMetadata | Null] = js.undefined
  /**
    * The electron-builder configuration.
    */
  val build: js.UndefOr[Configuration] = js.undefined
  /** @private */
  val dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The application description.
    */
  val description: js.UndefOr[String] = js.undefined
  /**
    * The url to the project [homepage](https://docs.npmjs.com/files/package.json#homepage) (NuGet Package `projectUrl` (optional) or Linux Package URL (required)).
    *
    * If not specified and your project repository is public on GitHub, it will be `https://github.com/${user}/${project}` by default.
    */
  val homepage: js.UndefOr[String | Null] = js.undefined
  /**
    * *linux-only.* The [license](https://docs.npmjs.com/files/package.json#license) name.
    */
  val license: js.UndefOr[String | Null] = js.undefined
  /** @private */
  val main: js.UndefOr[String | Null] = js.undefined
  /**
    * The application name.
    * @required
    */
  val name: js.UndefOr[String] = js.undefined
  /** @private */
  val productName: js.UndefOr[String | Null] = js.undefined
  /**
    * The [repository](https://docs.npmjs.com/files/package.json#repository).
    */
  val repository: js.UndefOr[String | RepositoryInfo | Null] = js.undefined
  /** @private */
  val version: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    author: AuthorMetadata = null,
    build: Configuration = null,
    dependencies: StringDictionary[String] = null,
    description: String = null,
    homepage: String = null,
    license: String = null,
    main: String = null,
    name: String = null,
    productName: String = null,
    repository: String | RepositoryInfo = null,
    version: String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

