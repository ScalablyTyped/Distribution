package typings.appBuilderLib.metadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
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
  val shortVersion: js.UndefOr[String | Null] = js.undefined
  /** @private */
  val shortVersionWindows: js.UndefOr[String | Null] = js.undefined
  /** @private */
  val version: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    author: js.UndefOr[Null | AuthorMetadata] = js.undefined,
    build: Configuration = null,
    dependencies: StringDictionary[String] = null,
    description: String = null,
    homepage: js.UndefOr[Null | String] = js.undefined,
    license: js.UndefOr[Null | String] = js.undefined,
    main: js.UndefOr[Null | String] = js.undefined,
    name: String = null,
    productName: js.UndefOr[Null | String] = js.undefined,
    repository: js.UndefOr[Null | String | RepositoryInfo] = js.undefined,
    shortVersion: js.UndefOr[Null | String] = js.undefined,
    shortVersionWindows: js.UndefOr[Null | String] = js.undefined,
    version: String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(homepage)) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (!js.isUndefined(license)) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(productName)) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (!js.isUndefined(repository)) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (!js.isUndefined(shortVersion)) __obj.updateDynamic("shortVersion")(shortVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(shortVersionWindows)) __obj.updateDynamic("shortVersionWindows")(shortVersionWindows.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

