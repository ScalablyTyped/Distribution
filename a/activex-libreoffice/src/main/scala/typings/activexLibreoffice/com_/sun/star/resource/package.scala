package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resource {
  /**
    * is used to signal that a resource is missing.
    * @see XResourceBundle
    */
  type MissingResourceException = typings.activexLibreoffice.com_.sun.star.uno.RuntimeException
  /**
    * describes a {@link XResourceBundleLoader} which provides access to the OpenOffice.org resource files.
    *
    * An OpenOffice.org installation comes with a number of resource files in an proprietary format, located inside the installation's program/resource
    * directory. The {@link OfficeResourceLoader} singleton (available at a component context as value with the key
    * `/singletons/com.sun.star.resource.OfficeResourceLoader` ), provides access to some types of resources within those files.
    *
    * Clients have to specify the resource file base name in the call to {@link XResourceBundleLoader.loadBundle()} resp. {@link
    * XResourceBundleLoader.loadBundle_Default()} method. The loader will extent this base name so that the resulting name conforms to the OpenOffice.org
    * resource file naming conventions, and look up the respective resource file, for the requested locale, in OpenOffice.org's installation.
    *
    * The lookup process uses the fallback mechanism as described at the {@link XResourceBundle} interface, except that `Locale.getDefault()` is not used.
    *
    * Resource keys, as passed to the {@link XResourceBundle.getDirectElement()} or {@link com.sun.star.container.XNameAccess.getByName()} , have the
    * following format: `<resource_type>:<numeric_identifier>` , where `<resource_type>` specifies the type of the requested resource (see below) and
    * `<numeric_identifier>` is the numeric identifier of the resource.
    *
    * The following resource types are currently supported: **string** : denotes a string resource
    *
    * Since the numeric resource identifiers are highly build-dependent (e.g. can change with any next OpenOffice.org build), you are **strongly**
    * discouraged from using the OfficeResoureLoader service in a component which targets more than one particular OpenOffice.org build.
    * @since OOo 2.0.3
    */
  type OfficeResourceLoader = typings.activexLibreoffice.com_.sun.star.resource.XResourceBundleLoader
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.awt.XDialog} interface. */
  type StringResource = typings.activexLibreoffice.com_.sun.star.resource.XStringResourcePersistence
}
