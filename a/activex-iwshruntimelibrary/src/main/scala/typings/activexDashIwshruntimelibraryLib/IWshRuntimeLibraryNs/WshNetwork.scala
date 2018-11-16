package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Network Object */
@JSGlobal("IWshRuntimeLibrary.WshNetwork")
@js.native
class WshNetwork protected () extends js.Object {
  val ComputerName: java.lang.String = js.native
  var `IWshRuntimeLibrary.WshNetwork_typekey`: WshNetwork = js.native
  val Organization: java.lang.String = js.native
  val Site: java.lang.String = js.native
  val UserDomain: java.lang.String = js.native
  val UserName: java.lang.String = js.native
  val UserProfile: java.lang.String = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Local name to assign to the connected printer.
           * @param RemoteName Name of the remote printer.
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def AddPrinterConnection(LocalName: java.lang.String, RemoteName: java.lang.String): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Local name to assign to the connected printer.
           * @param RemoteName Name of the remote printer.
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def AddPrinterConnection(LocalName: java.lang.String, RemoteName: java.lang.String, UpdateProfile: scala.Boolean): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Local name to assign to the connected printer.
           * @param RemoteName Name of the remote printer.
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def AddPrinterConnection(
    LocalName: java.lang.String,
    RemoteName: java.lang.String,
    UpdateProfile: scala.Boolean,
    UserName: java.lang.String
  ): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Local name to assign to the connected printer.
           * @param RemoteName Name of the remote printer.
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def AddPrinterConnection(
    LocalName: java.lang.String,
    RemoteName: java.lang.String,
    UpdateProfile: scala.Boolean,
    UserName: java.lang.String,
    Password: java.lang.String
  ): scala.Unit = js.native
  /**
           * @param string Path to printer connection
           * @param string [DriverName='']
           * @param string [Port='LPT1']
           *
           * Unlike the **AddPrinterConnection** method, this method allows you to create a printer connection without directing it to a specific port, such as LPT1.
           */
  def AddWindowsPrinterConnection(PrinterName: java.lang.String): scala.Unit = js.native
  /**
           * @param string Path to printer connection
           * @param string [DriverName='']
           * @param string [Port='LPT1']
           *
           * Unlike the **AddPrinterConnection** method, this method allows you to create a printer connection without directing it to a specific port, such as LPT1.
           */
  def AddWindowsPrinterConnection(PrinterName: java.lang.String, DriverName: java.lang.String): scala.Unit = js.native
  /**
           * @param string Path to printer connection
           * @param string [DriverName='']
           * @param string [Port='LPT1']
           *
           * Unlike the **AddPrinterConnection** method, this method allows you to create a printer connection without directing it to a specific port, such as LPT1.
           */
  def AddWindowsPrinterConnection(PrinterName: java.lang.String, DriverName: java.lang.String, Port: java.lang.String): scala.Unit = js.native
  def EnumNetworkDrives(): WshCollection = js.native
  def EnumPrinterConnections(): WshCollection = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Name by which the mapped drive will be known locally
           * @param RemoteName Share's UNC name (\\xxx\yyy)
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def MapNetworkDrive(LocalName: java.lang.String, RemoteName: java.lang.String): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Name by which the mapped drive will be known locally
           * @param RemoteName Share's UNC name (\\xxx\yyy)
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def MapNetworkDrive(LocalName: java.lang.String, RemoteName: java.lang.String, UpdateProfile: scala.Boolean): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Name by which the mapped drive will be known locally
           * @param RemoteName Share's UNC name (\\xxx\yyy)
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def MapNetworkDrive(
    LocalName: java.lang.String,
    RemoteName: java.lang.String,
    UpdateProfile: scala.Boolean,
    UserName: java.lang.String
  ): scala.Unit = js.native
  /**
           * Adds a remote MS-DOS-based printer connection to your computer system.
           * @param LocalName Name by which the mapped drive will be known locally
           * @param RemoteName Share's UNC name (\\xxx\yyy)
           * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
           *
           * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
           */
  def MapNetworkDrive(
    LocalName: java.lang.String,
    RemoteName: java.lang.String,
    UpdateProfile: scala.Boolean,
    UserName: java.lang.String,
    Password: java.lang.String
  ): scala.Unit = js.native
  /**
           * Removes a shared network drive from your computer system
           * @param Name Name of the mapped drive you want to remove. This will be the drive letter if the drive has a mapping between a local name (drive letter) and a remote name (UNC name);
           * it will be the UNC path if there is no such mapping
           * @param Force [false] Remove the connections even if the resource is in use
           * @param UpdateProfile [false] Remove the mapping from the user's profile
           */
  def RemoveNetworkDrive(Name: java.lang.String): scala.Unit = js.native
  /**
           * Removes a shared network drive from your computer system
           * @param Name Name of the mapped drive you want to remove. This will be the drive letter if the drive has a mapping between a local name (drive letter) and a remote name (UNC name);
           * it will be the UNC path if there is no such mapping
           * @param Force [false] Remove the connections even if the resource is in use
           * @param UpdateProfile [false] Remove the mapping from the user's profile
           */
  def RemoveNetworkDrive(Name: java.lang.String, Force: scala.Boolean): scala.Unit = js.native
  /**
           * Removes a shared network drive from your computer system
           * @param Name Name of the mapped drive you want to remove. This will be the drive letter if the drive has a mapping between a local name (drive letter) and a remote name (UNC name);
           * it will be the UNC path if there is no such mapping
           * @param Force [false] Remove the connections even if the resource is in use
           * @param UpdateProfile [false] Remove the mapping from the user's profile
           */
  def RemoveNetworkDrive(Name: java.lang.String, Force: scala.Boolean, UpdateProfile: scala.Boolean): scala.Unit = js.native
  /**
           * Removes a shared network printer connection from your computer system
           * @param Name Name that identifies the printer. Can be a UNC name (in the form `\\xxx\yyy`) or a local name (such as `LPT1`)
           * @param Force [false] Remove printer connection even if a user is still connected
           * @param UpdateProfile [false] Remove the printer connection from the user's profile
           *
           * The **RemovePrinterConnection** method removes both Windows and MS-DOS based printer connections. If the printer was connected using the method **AddPrinterConnection**,
           * _Name_ must be the printer's local name. If the printer was connected using the **AddWindowsPrinterConnection** method or was added manually (using the Add Printer wizard),
           * then _Name_ must be the printer's UNC name.
           */
  def RemovePrinterConnection(Name: java.lang.String): scala.Unit = js.native
  /**
           * Removes a shared network printer connection from your computer system
           * @param Name Name that identifies the printer. Can be a UNC name (in the form `\\xxx\yyy`) or a local name (such as `LPT1`)
           * @param Force [false] Remove printer connection even if a user is still connected
           * @param UpdateProfile [false] Remove the printer connection from the user's profile
           *
           * The **RemovePrinterConnection** method removes both Windows and MS-DOS based printer connections. If the printer was connected using the method **AddPrinterConnection**,
           * _Name_ must be the printer's local name. If the printer was connected using the **AddWindowsPrinterConnection** method or was added manually (using the Add Printer wizard),
           * then _Name_ must be the printer's UNC name.
           */
  def RemovePrinterConnection(
    Name: java.lang.String,
    Force: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibNumbers.`true`
  ): scala.Unit = js.native
  /**
           * Removes a shared network printer connection from your computer system
           * @param Name Name that identifies the printer. Can be a UNC name (in the form `\\xxx\yyy`) or a local name (such as `LPT1`)
           * @param Force [false] Remove printer connection even if a user is still connected
           * @param UpdateProfile [false] Remove the printer connection from the user's profile
           *
           * The **RemovePrinterConnection** method removes both Windows and MS-DOS based printer connections. If the printer was connected using the method **AddPrinterConnection**,
           * _Name_ must be the printer's local name. If the printer was connected using the **AddWindowsPrinterConnection** method or was added manually (using the Add Printer wizard),
           * then _Name_ must be the printer's UNC name.
           */
  def RemovePrinterConnection(
    Name: java.lang.String,
    Force: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibNumbers.`true`,
    UpdateProfile: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibNumbers.`true`
  ): scala.Unit = js.native
  def SetDefaultPrinter(Name: java.lang.String): scala.Unit = js.native
}

